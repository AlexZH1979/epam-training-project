package ru.yandex.zhmyd.hotel.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@ControllerAdvice
public class ErrorPageController {

    @RequestMapping(value = {"/error","/error/"}, method = RequestMethod.GET)
    public String errorPage(@RequestParam(required = false) String error,
                            @RequestParam(required = false) String returnPage,
                            Model model){
        if(error!=null&&!error.isEmpty()) {
            model.addAttribute(error);
        }
        if(returnPage!=null&&!returnPage.isEmpty()) {
            model.addAttribute(returnPage);
        }
        return "error";
    }
}
