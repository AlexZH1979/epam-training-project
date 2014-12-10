package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.RoomCategory;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.web.util.ControllerUtil;
import ru.yandex.zhmyd.hotel.web.vto.ListViewPart;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private static final Logger LOG = Logger.getLogger(OrderController.class.getName());

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public String getOrders(Authentication authentication, HttpSession session) {
        User user=ControllerUtil.setUserSession(session, authentication,userService);
        return "order.list";
    }

    //TODO
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
         @RequestMapping(value = "admin/{property}",method = RequestMethod.GET)
         public String administrateOrders(@MatrixVariable(value ="property", required = false) Map<String, Object> property){
        return null;
    }


    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/register/{param}", method = RequestMethod.GET)
    public ModelAndView registerOrder(@MatrixVariable Map<String, Object> param, HttpSession session,
                                      Authentication authentication) {

        User user = ControllerUtil.setUserSession(session, authentication, userService);

        DisplayedOrder displayedOrder;
        ModelAndView mav = new ModelAndView();

        try {
            Order order = createOrder(param, user.getId());
            LOG.info("Before convert order: " + order);
            //TODO
            displayedOrder = orderService.convertToDisplayedOrder(order);
            mav.addObject("order", displayedOrder);
            mav.setViewName("confurm.order");
            session.setAttribute("order", order);
        } catch (Exception e) {
            mav.setViewName("error");
        }
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
    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getOrders(@RequestBody final ListViewPart part,Authentication authentication) {
        Integer userId=ControllerUtil.getUser(authentication, userService).getId();
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
    @RequestMapping(value = {"/ajax/user/{userId}"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getOrdersByUserId(@RequestBody final ListViewPart part,@PathVariable Integer userId) {
        List<Order> orders = orderService.getIntervalOrdersByUserId(userId,part.getFirst(),part.getCount());
        List<DisplayedOrder> displayedOrders = orderService.convertToDisplayedOrders(orders);
        return displayedOrders;
    }

    /*
    * get hotel orders in interval begin->begin+count
     */
    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @RequestMapping(value = {"/ajax/hotel/{hotelId}"}, method = RequestMethod.POST)
    @ResponseBody
    public List<DisplayedOrder> getOrdersByHotelId(@RequestBody final ListViewPart part,@PathVariable Integer hotelId) {
        List<Order> orders = orderService.getIntervalOrdersByHotelId(hotelId, part.getFirst(), part.getCount());
        List<DisplayedOrder> displayedOrders = orderService.convertToDisplayedOrders(orders);
        return displayedOrders;
    }

    /*
    *==========================================
    *  ------------- PRIVATE METHODS-----------
    * =========================================
    */
    private Order createOrder(Map<String, Object> param, Integer userId) throws Exception {
        Set<Map.Entry<String, Object>> entrySet = param.entrySet();
        Order order = new Order();
        order.setCustomerId(userId);
        //if found unknown parameter throw exception
        //TODO VALIDATE
        for (Map.Entry<String, Object> entry : entrySet) {
            List list = (List) entry.getValue();
            String value = (String) list.get(0);
            switch (entry.getKey()) {
                case "hotelId":
                    order.setHotelId(Integer.valueOf(value));
                    break;
                case "start":
                    order.setStartDate(new Date(Long.valueOf(value)));
                    break;
                case "end":
                    order.setEndDate(new Date(Long.valueOf(value)));
                    break;
                case "places":
                    order.setPlaces(Integer.valueOf(value));
                    break;
                case "roomCategory":
                    order.setRoomCategory(RoomCategory.valueOf(value));
                    break;
                default:
                    throw new Exception();
            }
        }
        return order;
    }
}
