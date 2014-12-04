package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private static final Logger LOG=Logger.getLogger(OrderController.class.getName());

    @Autowired
    private OrderService orderService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String getOrders() {
        return "order.list";
    }

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerOrder(@RequestParam Order order, HttpSession session,Authentication authentication) {
        User user=(User)session.getAttribute("user");

        if (user == null) {
            ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
            user=userService.getUserByPrincipal(appUser);
            session.setAttribute("user", user);
        }

        order.setCustomerId(((User)session.getAttribute("user")).getId());
        LOG.info("Before save order: "+order);
        orderService.save(order);
        return "search.hotel";
    }

/*    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerOrder(@ModelAttribute("order") Order order) {
        System.out.println(order);
        orderService.save(order);
        return "search.hotel";
    }*/

/*   @RequestMapping(value = {"/get/{count}"}, method = RequestMethod.POST)
    public ModelAndView sendOrder(HttpSession session, @PathVariable("count") Integer countSize) {

        ModelAndView view = new ModelAndView();
        User user= (User) session.getAttribute("user");
        view.setViewName("submit.order");
        view.addObject("list", orderService.getInterval(1, countSize));
        return view;
    }*/

    //todo
    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Order> getOrders(@RequestBody final ListViewPart  part){
        return orderService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }
}
