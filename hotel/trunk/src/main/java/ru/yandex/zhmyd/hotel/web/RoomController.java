package ru.yandex.zhmyd.hotel.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.service.RoomService;
import ru.yandex.zhmyd.hotel.web.util.vto.ListViewPart;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    //TODO
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String getRoom(){
        return "room.list";
    }


/*   @RequestMapping(value = {"/get/{count}"}, method = RequestMethod.POST)
    public ModelAndView sendOrder(HttpSession session, @PathVariable("count") Integer countSize) {

        ModelAndView view = new ModelAndView();
        User user= (User) session.getAttribute("user");
        view.setViewName("submit.order");
        view.addObject("list", orderService.getInterval(1, countSize));
        return view;
    }*/

    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Room> getRooms(@RequestBody final ListViewPart part, HttpSession session){
        Integer id= (Integer) session.getAttribute("selectHotelId");
        Map map=new HashMap();
        map.put("hotel.id",id);
        return roomService.getInterval(map,Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }
}
