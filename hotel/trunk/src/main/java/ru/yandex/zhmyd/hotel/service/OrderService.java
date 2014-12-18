package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;

import java.util.List;

public interface OrderService extends BasicService<Order, Long>{

    List<Order> getOrdersByUserId(Integer userId);

    List<Order> getIntervalOrdersByUserId(Integer id, Integer begin, Integer count);

    List<Order> getIntervalOrdersByHotelId(Integer hotelId, Integer begin, Integer count);

    DisplayedOrder convertToDisplayedOrder(Order order);

    @Deprecated
    List<DisplayedOrder> convertToDisplayedOrders(List<Order> orders);

    Order confirmOrder(Long orderId, Integer roomId);

    //TODO
    Order disconfirmOrder(Long orderId);
}