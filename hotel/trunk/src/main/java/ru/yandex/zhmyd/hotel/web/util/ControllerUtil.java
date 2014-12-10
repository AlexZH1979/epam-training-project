package ru.yandex.zhmyd.hotel.web.util;


import org.springframework.security.core.Authentication;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;

public class ControllerUtil {

    //update key "user" in session
    public static User setUserSession(HttpSession session, Authentication authentication,UserService userService) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
            user = userService.getUserByPrincipal(appUser);
            session.setAttribute("user", user);
        }
        return user;
    }

    public static User getUser(Authentication authentication,UserService userService){
        ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
        return userService.getUserByPrincipal(appUser);
    }
}
