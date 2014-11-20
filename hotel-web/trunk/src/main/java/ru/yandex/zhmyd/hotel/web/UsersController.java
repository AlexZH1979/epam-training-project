package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yandex.zhmyd.hotel.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    //TODO
    @RequestMapping("/list")
    public String showUsers(Model model){
        model.addAttribute("users", userService.getAll());
        return "users.list";
    }
}
