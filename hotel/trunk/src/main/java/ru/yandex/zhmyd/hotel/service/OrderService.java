package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;

import java.util.List;

public interface OrderService extends BasicService<Order, Integer>{

    public List<Order> getOrdersByUserId(Integer userId);

    List<Order> getIntervalOrdersByUserId(Integer id, Integer begin, Integer count);

    List<Order> getIntervalOrdersByHotelId(Integer hotelId, Integer begin, Integer count);

    public DisplayedOrder convertToDisplayedOrder(Order order);

    @Deprecated
    public List<DisplayedOrder> convertToDisplayedOrders(List<Order> orders);
}
