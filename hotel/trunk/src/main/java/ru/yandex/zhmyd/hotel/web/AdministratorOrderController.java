package ru.yandex.zhmyd.hotel.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.RoomService;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.EntityNonFoundException;

import static ru.yandex.zhmyd.hotel.web.util.PathSelector.HOTEL;
import static ru.yandex.zhmyd.hotel.web.util.PathSelector.USER;

@Controller
@RequestMapping("/orders/admin")
public class AdministratorOrderController {

    private static final Logger LOG = Logger.getLogger(AdministratorOrderController.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RoomService roomService;

    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/{order}", method = RequestMethod.GET)
    public ModelAndView administrateOrder(@PathVariable Order order) {
        ModelAndView mav = new ModelAndView("order.administrator.info");
        try {
            mav.addObject("displayedOrder", orderService.convertToDisplayedOrder(order));
        }catch(NullPointerException e){
            mav.addObject("error","Not found");
        }
        return mav;
    }

    @PreAuthorize("isFullyAuthenticated() and hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/confirm/", method = RequestMethod.GET)
    public String orderConfirm(@RequestParam(required = true) Long orderId,
                               @RequestParam(required = true) Integer roomId) {
        String view;
        try {
            orderService.confirmOrder(orderId, roomId);
            view = "redirect:/orders/admin/" + orderId;
        } catch (EntityNonFoundException e) {
            view = "redirect:/error?error=" + e.getMessage();
        }
        return view;
    }

    @PreAuthorize("isFullyAuthenticated() and hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/disconfirm/", method = RequestMethod.GET)
    public String orderDisconfirm(@RequestParam(required = true) Long orderId) {
        String view;
        try {
            orderService.disconfirmOrder(orderId);
            view = "redirect:/orders/admin/" + orderId;
        } catch (EntityNonFoundException e) {
            view = "redirect:/error?error=" + e.getMessage();
        }
        return view;
    }

    @PreAuthorize("isFullyAuthenticated() and hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "/{selector}/{id}", method = RequestMethod.GET)
    public ModelAndView showAdministrateOrder(@PathVariable String selector, @PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("orders.administrator.list");
        try {
            switch (selector) {
                case USER:
                    mav.addObject("path", "/orders/ajax/user/" + id);
                    mav.addObject("nameIntem", "User");
                    mav.addObject("intem", userService.getById(id).getFirstName());
                    break;
                case HOTEL:
                    mav.addObject("path", "/orders/ajax/hotel/" + id);
                    mav.addObject("nameIntem", "Hotel");
                    mav.addObject("intem", hotelService.getById(id).getName());
                    break;
                default:
                    mav.addObject("path", "/orders/ajax/all/");
            }
        }catch(NullPointerException e){
            mav.addObject("error", "BAD REQUEST PARAMETER");
        }
        return mav;
    }
}
