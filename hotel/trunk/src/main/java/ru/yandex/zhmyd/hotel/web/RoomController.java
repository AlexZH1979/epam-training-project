package ru.yandex.zhmyd.hotel.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.zhmyd.hotel.service.RoomService;

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


 /*   @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Room> getRooms(@RequestBody final ListViewPart part, HttpSession session){
        Integer id= (Integer) session.getAttribute("selectHotelId");
        Map map=new HashMap();
        map.put("hotel.id",id);
        return roomService.getInterval(map,Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }*/
}
