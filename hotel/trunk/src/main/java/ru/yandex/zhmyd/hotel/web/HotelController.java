package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.model.RoomCategory;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.SearchHotelService;
import ru.yandex.zhmyd.hotel.web.util.vto.ListViewPart;
import ru.yandex.zhmyd.hotel.web.util.vto.SearchParam;

import java.util.List;
import java.util.logging.Logger;

import static ru.yandex.zhmyd.hotel.model.parameters.SearchParameter.ADDRESS;
import static ru.yandex.zhmyd.hotel.model.parameters.SearchParameter.Associations.*;
import static ru.yandex.zhmyd.hotel.model.parameters.SearchParameter.NAME;

@Controller
@RequestMapping("/hotels")
@PreAuthorize("permitAll()")
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
        mav.addObject("roomCategory", RoomCategory.values());
        mav.setViewName("hotel");
        return mav;
    }

   /*
    *    *
    * non used ajax methods
    */
    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Hotel> getHotels(@RequestBody final ListViewPart part){
        return hotelService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));
    }

    @RequestMapping(value = {"/ajax/size"}, method = RequestMethod.POST)
    @ResponseBody
    public Long getHotelsListSize(){
        return hotelService.getSizeList();
    }


    /*
     *
     * AJAX search methods
     *
     */

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<Hotel> searchHotelsByParameter(@RequestBody SearchParam param) {
        if (param.getValue().isEmpty() || param.getValue().equals(" ")||param.getValue().equals("")) {
            return null;
        }
        switch (param.getParameter()) {
            case NAME:
                return searchHotelService.searchByName( param.getValue(),0,20);
            case STATE:
            case COUNTY:
            case CITY:
            case ADDRESS:
                return searchHotelService.searchByAddress(param.getParameter(), param.getValue(),0,20);
            default:
                return null;
        }
    }

    @RequestMapping(value = "/search/length", method = RequestMethod.POST)
    @ResponseBody
    public Long lengthSearchHotelsByParameter(@RequestBody SearchParam param) {
        if (param.getValue().isEmpty() || param.getValue().equals(" ")||param.getValue().equals("")) {
            return null;
        }
        switch (param.getParameter()) {
            case NAME:
                return searchHotelService.lengthSearchByName(param.getValue());
            case STATE:
            case COUNTY:
            case CITY:
            case ADDRESS:
                return searchHotelService.lengthSearchByAddress(param.getParameter(), param.getValue());
            default:
                return null;
        }
    }
}
