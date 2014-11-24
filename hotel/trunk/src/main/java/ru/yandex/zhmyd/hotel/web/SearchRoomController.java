package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.service.SearchRoomService;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/search/")
public class SearchRoomController {

    @Autowired
    private SearchRoomService service;

    public ModelAndView searchRoom(Model model, HashMap param) {
        List<Room> rooms = service.searchByParameters(param);
        model.addAttribute("rooms", rooms);
        ModelAndView mav=new ModelAndView();
        mav.addObject(model);
        mav.setViewName("searchroom");
        return mav;
    }
}
