package ru.yandex.zhmyd.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/error")
public class ErrorPageController {

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String errorPage(@RequestParam(required = false) String error, Model model){
        model.addAttribute("errorMessage", error);
        return "error";
    }
}
