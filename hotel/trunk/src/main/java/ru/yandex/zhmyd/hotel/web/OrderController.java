package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String getOrders() {
        return "order.list";
    }

    @RequestMapping(value = "/register/", method = RequestMethod.GET)
    public String registerOrder(@RequestParam("hotelId") Integer hotelId, @RequestParam("start") Date start,
                                @RequestParam("end") Date end) {
        System.out.println("hotelId "+hotelId+"; start: "+start+"; end: "+end);
        return "map";
    }

    @RequestMapping(value = "/register/send", method = RequestMethod.POST)
    public String registerOrder() {
        return null;
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
    public List<Order> getOrders(@RequestBody final ListViewPart  part){
        System.out.println(part);
        return orderService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }
}
