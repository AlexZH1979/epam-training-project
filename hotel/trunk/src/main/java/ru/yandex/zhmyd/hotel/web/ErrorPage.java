package ru.yandex.zhmyd.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorPage {

    @RequestMapping(value = {"","/"})
    public String errorPage(){
        return "error";
    }
}
