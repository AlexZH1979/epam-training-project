package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;

/*
*
* Display and control user profile
* @RequestMapping value=/profile
* TODO
* User.role=Role.CUSTOMER, can see and edit only ouver profile, all userId redirect to current user profile page
* User.role=Role.MODERATOR, can see all profile, but can edit only  your profile
*
*/

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private UserService userService;

    //TODO
    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String showUserProfile(Authentication authentication, HttpSession session, Model model) {
        Object user=session.getAttribute("user");

        if((user==null)||!(user instanceof User)) {
            ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
            user = userService.getUserByPrincipal(appUser);
        }
        session.removeAttribute("user");
        model.addAttribute("currentUser", user);
        session.setAttribute("user", user);
        return "profile";
    }

    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String showUserProfile(
            @PathVariable("userId") User userProfiled,
            HttpSession session, Model model) {

       Object userObject = session.getAttribute("user");
        if ((userObject != null) && (userObject instanceof User)) {
            User user = (User) userObject;
            model.addAttribute("user", user);
        }
        model.addAttribute("currentUser", userProfiled);
        return "profile";
    }
}