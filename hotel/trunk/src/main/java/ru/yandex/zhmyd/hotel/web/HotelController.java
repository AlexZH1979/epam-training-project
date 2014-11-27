package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.SearchHotelService;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @Autowired
    private SearchHotelService searchHotelService;


    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String getHotels(){
        return "hotels.list";
    }

    @RequestMapping(value = {"/search"}, method = RequestMethod.GET)
    public String getHotelsByParameter(){
        return "search.hotel";
    }


    @RequestMapping(value ="/{hotelId}", method = RequestMethod.GET)
    public ModelAndView getHotels(@PathVariable("hotelId") Hotel hotel){
        ModelAndView mav=new ModelAndView();
        mav.addObject("hotel", hotel);
        mav.setViewName("hotel");
        return mav;
    }

    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Hotel> getHotels(@RequestBody final ListViewPart part){
        return hotelService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));
    }

    @RequestMapping(value = "/set/{hotelId}")
    public String selectHotel(@PathVariable("hotelId") Hotel hotel, HttpSession session){
        session.setAttribute("selectHotelId", hotel.getId());
        return "redirect:/hotels/"+hotel.getId();
    }

    @RequestMapping(value = {"/ajax/size"}, method = RequestMethod.POST)
    @ResponseBody
    public Long getHotelsListSize(){
        return hotelService.getSizeList();
    }

    @RequestMapping(value = "/search/ajax/states", method = RequestMethod.POST)
    @ResponseBody
    public List<String> getStates() {
        return searchHotelService.getStatesToString();

    }

    /*
    *
    *
    * AJAX search methods
    *
    *
    *
     */

    //TODO
    @RequestMapping(value = "/search/{param}", method = RequestMethod.POST)
    @ResponseBody
    public List<Hotel> searchHotelsByParameter(@RequestParam(value = "value") String input, @PathVariable String param){
        switch (param){
            case "state":
                return searchHotelService.searchByAddressAssociation("state",input);
            default:return null;
        }
    }
    @RequestMapping(value = "/search/{param}/length", method = RequestMethod.POST)
    @ResponseBody
    public Integer lengthSearchHotelsByParameter(@RequestParam(value = "value") String input, @PathVariable String param) {
        switch (param) {
            case "state":
                return searchHotelService.searchByAddressAssociation("state",input).size();
            default:
                return null;
        }
    }
}
