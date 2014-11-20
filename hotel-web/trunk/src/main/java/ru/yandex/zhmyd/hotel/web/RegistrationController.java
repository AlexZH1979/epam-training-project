package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.zhmyd.hotel.model.Gender;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.model.UserRole;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String editUser(Model model) {
        User user = new User();
        model.addAttribute("client", user);
        model.addAttribute("genderList", Arrays.asList(Gender.values()));
        return "registration";
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public String newClientSubmit(
            @ModelAttribute User client,
            Model model, HttpSession session) {

        if (client == null) {
            return "login";
        }
        System.out.println("--------------" + client + "----------");
        if (client.getFirstName() == "" || client.getLastName() == ""
                || client.getEmail() == "" || client.getLogin() == ""
                || client.getPassword() == "") {
            return "registration";
        }
        client.setRole(UserRole.CUSTOMER);
        userService.save(client);
        client = userService.getUserByCredits(client.getLogin(), client.getPassword());
        session.setAttribute("user", client);
        model.addAttribute("currentUser", client);

        return "profile";
    }

}
