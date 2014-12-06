package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.RoomCategory;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;
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

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String getOrders() {
        return "order.list";
    }

    @PreAuthorize("isFullyAuthenticated()")
    @RequestMapping(value = "/register/{param}", method = RequestMethod.GET)
    public String registerOrder(@MatrixVariable Map<String, Object> param, HttpSession session, Authentication authentication) {
        User user=(User)session.getAttribute("user");
        if (user == null) {
            ApplicationUserDetails appUser = (ApplicationUserDetails) authentication.getPrincipal();
            user=userService.getUserByPrincipal(appUser);
            session.setAttribute("user", user);
        }
        Order order = createOrder(param, user.getId());
        try {
            LOG.info("Before save order: " + order);
            orderService.save(order);
        } catch (ServiceException e) {
        }
        return "search.hotel";
    }

    @RequestMapping(value = {"/ajax"}, method = RequestMethod.POST)
    @ResponseBody
    public List<Order> getOrders(@RequestBody final ListViewPart  part){
        return orderService.getInterval(Integer.parseInt(part.getFirstResult()), Integer.parseInt(part.getSelectCount()));

    }

    private Order createOrder(Map<String, Object> param, Integer userId) throws IllegalArgumentException {
        Set<Map.Entry<String, Object>> entrySet = param.entrySet();
        Order order = new Order();
        order.setCustomerId(userId);

        try {
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

                }
            }
        } catch (Exception e) {
            LOG.warning(e.toString());
            throw new IllegalArgumentException(e);
        }

        return order;
    }
}
