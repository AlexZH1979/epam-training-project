package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.SearchHotelService;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;
import ru.yandex.zhmyd.hotel.web.vto.SearchParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/hotels")
public class HotelController {

    private static final Logger LOG = Logger.getLogger(HotelController.class.getName());

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


    /*
     *
     *
     * AJAX search methods
     *
     *
     *
     */

    //TODO
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<Hotel> searchHotelsByParameter(@RequestBody SearchParam param) {
        switch (param.getParameter()) {
            case "name":
                return searchHotelService.searchByName( param.getValue(),0,20);
            case "state":
            case "county":
            case "city":
            case "address":
                return searchHotelService.searchByAddress(param.getParameter(), param.getValue(),0,20);
            default:
                return null;
        }
    }

    @RequestMapping(value = "/search/length", method = RequestMethod.POST)
    @ResponseBody
    public Long lengthSearchHotelsByParameter(@RequestBody SearchParam param) {
        switch (param.getParameter()) {
            case "name":
                return searchHotelService.lengthSearchByName(param.getValue());
            case "state":
            case "county":
            case "city":
            case "address":
                return searchHotelService.lengthSearchByAddress(param.getParameter(), param.getValue());
            default:
                return null;
        }
    }
}
