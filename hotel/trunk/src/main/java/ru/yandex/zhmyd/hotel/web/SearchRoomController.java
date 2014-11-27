package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yandex.zhmyd.hotel.service.SearchHotelService;

@Controller
@RequestMapping("/search/")
public class SearchRoomController {

    @Autowired
    private SearchHotelService service;

   /* public ModelAndView searchRoom(Model model, HashMap param) {
        List<Room> rooms = service.searchByParameters(param);
        model.addAttribute("rooms", rooms);
        ModelAndView mav=new ModelAndView();
        mav.addObject(model);
        mav.setViewName("searchroom");
        return mav;
    }*/
}
