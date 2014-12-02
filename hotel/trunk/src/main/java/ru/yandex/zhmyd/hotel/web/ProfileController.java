package ru.yandex.zhmyd.hotel.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.zhmyd.hotel.model.User;

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

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String showUserProfile(Authentication authentication,HttpSession session){
        Object userObject = session.getAttribute("user");
        if ((userObject != null) && (userObject instanceof User)) {
            User user = (User) userObject;
            return "redirect:/"+user.getId();
        }
        return "profile";
    }

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