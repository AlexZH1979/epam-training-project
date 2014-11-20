package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * Created by Александр on 04.11.2014.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService service;

    @RequestMapping(value = {"", "/", "/login"}, method = {RequestMethod.GET})
    public String login() {
        return "login";
    }

    //TODO
    @RequestMapping("/map")
    public String getMap(){
        return "map";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ModelAndView loggin(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password, Model model, HttpSession session) {

        User user = service.getUserByCredits(username, password);

        ModelAndView mav = new ModelAndView();
        if (user != null) {
            session.setAttribute("user", user);
            mav = new ModelAndView("redirect:/profile/" + user.getId());
        } else {
            mav.addObject("error", "Invalid username or password!");
            mav.setViewName("login");
        }
        return mav;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session) {

        ModelAndView model = new ModelAndView();
        model.setViewName("login");

        session.setAttribute("user", null);
        session.invalidate();

        return model;
    }
}
