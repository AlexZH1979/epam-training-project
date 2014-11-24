package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String getRoom(Model model){
        return "users.list";
    }


    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<User> getRooms(@RequestBody final ListViewPart part){
        System.out.println(part);
        return userService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }
}
