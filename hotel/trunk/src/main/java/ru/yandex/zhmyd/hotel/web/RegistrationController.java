package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Gender;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.model.UserRole;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String editUser(Model model) {
        User user=new User();
        model.addAttribute("registredUser", user);
        model.addAttribute("genderList", Arrays.asList(Gender.values()));
        return "registration";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public ModelAndView newClientSubmit(
           @ModelAttribute User client, @RequestParam(value = "submit") String submit,HttpSession session) {
        if(submit.isEmpty()||submit.equals("Cancel")){
            return new ModelAndView("login");
        }
        ModelAndView mav=new ModelAndView();

        //TODO validation framework ???
        StringBuilder sb=new StringBuilder();
        if (client == null)sb.append("user data is null <br>");
        if(client.getFirstName().isEmpty()||client.getFirstName().equals(""))sb.append("first name don't can empty<br>");
        if(client.getLastName().isEmpty()) sb.append("last name don't can empty<br>");
        if(client.getEmail().isEmpty()) sb.append("last name don't can empty<br>");
        if(client.getLogin().isEmpty()|| client.getPassword().isEmpty()) sb.append("login & password name don't can empty<br>");
        if(sb.length()!=0) {
            mav.addObject("error", sb.toString());
            mav.setViewName("registration");
            return mav;
        }
        // end TODO
        client.setRole(UserRole.CUSTOMER);
        try {
            userService.save(client);
        }catch (ServiceException e){
            mav.addObject("error", e.getMessage());
            mav.setViewName("registration");
            return mav;
        }
        userService.save(client);
        client = userService.getUserByCredits(client.getLogin(), client.getPassword());
        session.setAttribute("user", client);
        mav.setViewName("redirect://profile/" + client.getId());
        return mav;
    }
}