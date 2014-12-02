package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService service;

    @RequestMapping(value = { "/login"}, method = {RequestMethod.GET})
    public String login() {
        return "login";
    }
@RequestMapping(value = {"", "/"}, method = {RequestMethod.GET})
    public String login1() {
        return "order.list";
    }

    //TODO
    @RequestMapping("/map")
    public String getMap(){
        return "map";
    }

/*    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ModelAndView login(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            HttpSession session) {
            User user = service.getUserByCredits(username, password);
            ModelAndView mav;
            if (user != null) {
                session.setAttribute("user", user);
                mav = new ModelAndView("redirect:/profile/" + user.getId());
            } else {
                mav=new ModelAndView();
                mav.addObject("error", "Invalid username or password!");
                mav.setViewName("redirect:/profile/");
            }
            return mav;
    }*/

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session) {

        ModelAndView model = new ModelAndView();
        model.setViewName("login");

        session.setAttribute("user", null);
        session.setAttribute("selectHotelId", null);
        session.invalidate();

        return model;
    }
}
