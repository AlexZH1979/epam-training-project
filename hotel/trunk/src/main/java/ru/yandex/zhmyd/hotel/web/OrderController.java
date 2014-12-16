package ru.yandex.zhmyd.hotel.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.EntityNonFoundException;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private static final Logger LOG = Logger.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @Autowired
    private HotelService hotelService;

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String getOrders() {
        return "order.list";
    }

/*    //TODO
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "admin/user/{userId}", method = RequestMethod.GET)
    public ModelAndView getOrdersByUserId(@PathVariable Integer userId) {
        ModelAndView mav = new ModelAndView("orders.administrator.list");
        mav.addObject("path", "/orders/ajax/user/" + userId);
        mav.addObject("user", userService.getById(userId));
        return mav;
    }*/

    //TODO
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "admin/", method = RequestMethod.GET)
    public ModelAndView administrateOrders() {
        ModelAndView mav = new ModelAndView("orders.administrator.list");
        mav.addObject("path", "/orders/ajax/all/");
        return mav;
    }

    //TODO добавить страницу отображения свойств заказа
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = "admin/{selector}/{id}", method = RequestMethod.GET)
    public ModelAndView administrateOrder(@PathVariable("selector") String selector, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView("orders.administrator.list");
        switch (selector) {
            case "user":
                mav.addObject("path", "/orders/ajax/user/" + id);
                mav.addObject("intem", userService.getById(id).getFirstName());
                mav.addObject("nameIntem", "User");
                break;
            case "hotel":
                mav.addObject("path", "/orders/ajax/hotel/" + id);
                mav.addObject("intem", hotelService.getById(id).getName());
                mav.addObject("nameIntem", "Hotel");
                break;
            default:
                mav.addObject("path", "/orders/ajax/all/");
        }
        return mav;
    }

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/register/{param}", method = RequestMethod.GET)
    public ModelAndView registerOrder(@Valid @ModelAttribute Order order, HttpSession session,
                                      Authentication authentication) {
    //TODO валидация дат
        ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
        User user = userService.getUserByPrincipal(appUser);
        //set user only in server-side
        order.setCustomerId(user.getId());
        DisplayedOrder displayedOrder;
        ModelAndView mav = new ModelAndView();
        LOG.info("ORDER "+order);
        displayedOrder = orderService.convertToDisplayedOrder(order);
        mav.addObject("order", displayedOrder);
        mav.setViewName("confirm.order");
        session.setAttribute("order", order);
        return mav;
    }

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/register/send", method = RequestMethod.GET)
    public String sendOrder(HttpSession session) {
        //TODO
        String view = "redirect:/orders";
        try {
            Order order = (Order) session.getAttribute("order");
            orderService.save(order);
        }catch (Exception e){
            //TODO
            view = "error";
        } finally {
            session.removeAttribute("order");
        }
        return view;
    }

    /*
     *========================
     * -------AJAX METHODS----
     * =======================
     */
    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/ajax/delete", method = RequestMethod.POST)
    @ResponseBody
    public List<String> deleteOrders(@RequestBody List<String> listId) {
        //list orderIds then delete success or object don't exist
        List<String> deletedId = new ArrayList<>();
        LOG.info("GET to delete List ids="+listId);

        for (String id : listId) {
            LOG.info("GET to delete id="+Integer.valueOf(id));
            try {
                orderService.delete(Integer.valueOf(id));
                deletedId.add(id);
            } catch (EntityNonFoundException e) {
                //object absent in present time, remove it's from view table
                deletedId.add(id);
                LOG.warn(e.getMessage());
            }catch (ServiceException e){
                //don't delete because order.confirm=true
                LOG.warn(e.getMessage());
            }
        }
        return deletedId;
    }


    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getOrders(@RequestBody final ListViewPart part,Authentication authentication) {
        ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
        Integer userId = userService.getUserByPrincipal(appUser).getId();
        List<Order> orders = orderService.getIntervalOrdersByUserId(userId,part.getFirst(), part.getCount());
        List<DisplayedOrder> displayedOrders = orderService.convertToDisplayedOrders(orders);
        return displayedOrders;
    }

    /*
    * get orders in interval begin->begin+count
     */
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = {"/ajax/all"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getAllOrders(@RequestBody final ListViewPart part) {
        List<Order> orders = orderService.getInterval(part.getFirst(),part.getCount());
        List<DisplayedOrder> displayedOrders = orderService.convertToDisplayedOrders(orders);
        return displayedOrders;
    }

    /*
    * get user orders in interval begin->begin+count
     */
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = {"/ajax/{selector}/{id}"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getOrdersByUserId(@RequestBody final ListViewPart part,
                                                  @PathVariable("selector") String selector,
                                                  @PathVariable("id") Integer id,
                                                  @RequestParam(value = "hide", required = false) String hide) {
        List<Order> orders = null;
        LOG.info("Selector="+selector+"; id="+id+"; hide="+hide);
        if (hide == null || hide.equals("false")) {
            switch (selector) {
                case "user":
                    orders = orderService.getIntervalOrdersByUserId(id, part.getFirst(), part.getCount());
                    break;
                case "hotel":
                    orders = orderService.getIntervalOrdersByHotelId(id, part.getFirst(), part.getCount());
                    break;
            }
        }else if (hide.equals("confurm")){

        }
        List<DisplayedOrder> displayedOrders = orderService.convertToDisplayedOrders(orders);
        return displayedOrders;
    }
}
