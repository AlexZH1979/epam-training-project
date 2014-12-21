package ru.yandex.zhmyd.hotel.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.service.AddressService;
import ru.yandex.zhmyd.hotel.service.HotelService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.yandex.zhmyd.hotel.model.parameters.SearchParameter.ADDRESS;
import static ru.yandex.zhmyd.hotel.model.parameters.SearchParameter.Associations.*;

@Controller
@RequestMapping("/hotels/admin")
@PreAuthorize("isFullyAuthenticated() and hasRole('ROLE_ADMINISTRATOR')")
public class AdministratorHotelController {

    private static final Logger LOG=Logger.getLogger(AdministratorHotelController.class);

    @Autowired
    private HotelService hotelService;

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String hotelList(){ return "hotels.list";}

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editHotel(@PathVariable("id") Hotel hotel, Model model){
        String view="hotel.edit";
        try {
            model.addAttribute(hotel);
        }catch(IllegalArgumentException e){
            view="redirect:/error";
            model.addAttribute("errorMessage",e.getMessage());
        }
        return  view;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editHotelData(@Valid @ModelAttribute Hotel hotel,BindingResult result){
        System.out.println("hotel = " + hotel);
        System.out.println("result = " + result);
        if(result.hasErrors()){
            return "hotel.edit";
        }
        try{
            hotelService.update(hotel);
        }catch (Exception e){
             return "redirect:/error?errorMessage="+e.getMessage();
        }
        return "redirect:/hotels/"+hotel.getId();
    }

    @RequestMapping(value = "/edit/{id}/address/{parameter}/", method = RequestMethod.GET)
     public String editHotelAddress(@PathVariable("id") Integer id,
                                    @PathVariable String parameter,
                                    @ModelAttribute("value") String value,
                                    HttpSession session,
                                    Model model){
        List<String> subParameters;
        String beginPath="/hotels/admin/edit/"+id+"/address/";
        model.addAttribute("beginPath",beginPath);

        //Address MAP fill
        Object addressObj=session.getAttribute("addressMap");
        if(addressObj==null||!(addressObj instanceof Map)){
            addressObj=new HashMap<String, String>();
            session.setAttribute("addressMap",addressObj);
        }
        Map<String, String> address= (Map<String, String>) addressObj;
        LOG.info("ADDRESS MAP IN SESSION: "+address);
        //END
        switch (parameter){
            case STATE:
                subParameters=addressService.getStates();
                LOG.info("STATE: " + subParameters);
                //[STATE] for path and next select
                model.addAttribute("parameterForSelect", STATE);
                model.addAttribute("endPath", COUNTY);
                model.addAttribute("valuesList", subParameters);
                break;
            case COUNTY:
                address.put(STATE, value);
                subParameters=addressService.getNameSubParameters(STATE,value);
                LOG.info("COUNTY: "+subParameters);
                model.addAttribute("parameterForSelect",  COUNTY);
                model.addAttribute("endPath", CITY);
                model.addAttribute("valuesList", subParameters);
                break;
            case CITY:
                address.put(COUNTY, value);
                subParameters=addressService.getNameSubParameters(COUNTY,value);
                LOG.info("CITY: "+subParameters);
                model.addAttribute("parameterForSelect",  CITY);
                model.addAttribute("endPath", ZIP);
                model.addAttribute("valuesList", subParameters);
                break;
            case ZIP:
                address.put(CITY, value);
                subParameters=addressService.getNameSubParameters(CITY,value);
                LOG.info("ZIP: "+subParameters);
                model.addAttribute("parameterForSelect",ZIP);
                model.addAttribute("endPath", ADDRESS);
                model.addAttribute("valuesList", subParameters);
                break;
            case ADDRESS:
                address.put(ZIP, value);
                model.addAttribute("parameterForSelect",ADDRESS);
                model.addAttribute("endPath", "");
                return "hotel.address.edit.a";
            case "":
                address.put(ADDRESS, value);
                return "hotel.address.edit.a";
            default:
        }
        return "hotel.address.edit";
    }

    @RequestMapping(value = "/edit/{id}/address/{parameter}/send/", method = RequestMethod.GET)
    public String getHotelAddress(@PathVariable("id") Integer id,
                                   @PathVariable String parameter,
                                   @RequestParam String value,
                                   Model model){

        StringBuffer sb=new StringBuffer();
        String view;
        sb.append("redirect:/hotels/admin/edit/").append(id).append("/address/");
        switch (parameter){
            case STATE:
                view=sb.append(COUNTY).append("/").toString();
                break;
            case COUNTY:
                view=sb.append(CITY).append("/").toString();
                break;
            case CITY:
                view=sb.append(ZIP).append("/").toString();
                break;
            case ZIP:
                view=sb.append(ADDRESS).append("/").toString();
                break;
            case ADDRESS:
                view=sb.append("/").toString();
                break;
            default:
                view="redirect:/error";
        }
        model.addAttribute("value", value);
        return view;
    }
}
