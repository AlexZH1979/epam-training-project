package ru.yandex.zhmyd.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.service.OrderService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView createOrder(HttpSession session) {
        ModelAndView view = new ModelAndView();
        User user= (User) session.getAttribute("user");
        view.setViewName("order.list");
        view.addObject("list", orderService.getOrdersByUserId(user.getId()));
        return view;
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView sendOrder(Model model) {

        ModelAndView view = new ModelAndView();
        view.setViewName("submit.order");
        view.addObject("order", orderService.getOrdersByUserId(1L));
        return view;
    }
}
