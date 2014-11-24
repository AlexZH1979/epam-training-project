package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Gender;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.model.UserRole;
import ru.yandex.zhmyd.hotel.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;

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
    public ModelAndView newClientSubmit(
            @ModelAttribute User client, HttpSession session) {

       //todo
        System.out.println("--------------" + client + "----------");
        boolean crush=false;
        HashMap<String, String> errors=new HashMap<>();
        if (client == null||client.getFirstName() == "" || client.getLastName() == ""
                || client.getEmail() == "" || client.getLogin() == ""
                || client.getPassword() == "") {
            return new ModelAndView("redirect:/reg");
        }
        //TODO
        client.setRole(UserRole.CUSTOMER);
        userService.save(client);
        client = userService.getUserByCredits(client.getLogin(), client.getPassword());
        session.setAttribute("user", client);

        return new ModelAndView("redirect:/profile/" + client.getId());
    }

}
