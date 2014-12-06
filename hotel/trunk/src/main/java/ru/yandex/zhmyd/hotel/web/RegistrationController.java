package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.zhmyd.hotel.model.Gender;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.model.UserRole;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;

import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService detailsService;

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String editUser(Model model) {
        User user=new User();
        model.addAttribute("client", user);
        model.addAttribute("genderList", Arrays.asList(Gender.values()));
        return "registration";
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public String newClientSubmit(@Valid @ModelAttribute("client") User client,
                                  BindingResult bindingResult, Model model) {
        String view = "redirect:/profile";
        if (bindingResult.hasErrors()) {
            view = "registration";
        } else {
            client.setRole(UserRole.CUSTOMER);
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            client.setPassword(passwordEncoder.encode(client.getPassword()));

            try {
                userService.save(client);
              /*  UserDetails userDetails=detailsService.loadUserByUsername(client.getLogin());
                Authentication authentication =  new UsernamePasswordAuthenticationToken(userDetails,userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);*/
            } catch (ServiceException e) {
                model.addAttribute("errors",e.getMessage());
                view = "registration";
            }
        }
        return view;
    }
}