package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PreAuthorize("permitAll")
    @RequestMapping(value = {"/login"}, method = {RequestMethod.GET})
    public ModelAndView login(Authentication authentication, HttpSession session, @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
            session.setAttribute("user", null);
            session.invalidate();
            model.setViewName("search.hotel");
        } else if (isUserSessionFound(session)) {
            Object user=session.getAttribute("user");

            if((user==null)||!(user instanceof User)) {
                ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
                user = userService.getUserByPrincipal(appUser);
            }
            session.removeAttribute("user");
            model.addObject("currentUser", user);
            session.setAttribute("user", user);
            model.setViewName("profile");
        }
        return model;
    }

    //REDIRECT CURRENT START PAGE
    @RequestMapping(value = {"", "/"}, method = {RequestMethod.GET})
    public String firstPage() {
        return "redirect:/hotels/search";
    }

    //TODO
    @RequestMapping("/map")
    public String getMap(){
        return "map";
    }


    private boolean isUserSessionFound(HttpSession session) {
        return session.getAttribute("user") instanceof User;
    }
}
