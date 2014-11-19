package ru.yandex.zhmyd.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.User;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public ModelAndView test(){
        ModelAndView view=new ModelAndView("registration");
        view.addObject("client",new User());
        return view;
    }
}
