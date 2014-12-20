package ru.yandex.zhmyd.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Hotel;

@Controller
@RequestMapping("/hotels/admin")
public class AdministratorHotelController {

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editHotel(@PathVariable("id") Hotel hotel){
        ModelAndView mav=new ModelAndView("hotel.edit");
        mav.addObject(hotel);
        return  mav;
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editHotelData(@ModelAttribute Hotel hotel,BindingResult result,@PathVariable("id") Hotel oldHotel){
        if(result.hasErrors()){
            return "/hotels/admin/edit/"+oldHotel.getId();
        }
        return "redirect:/hotels/admin/edit/"+oldHotel.getId();
    }
}
