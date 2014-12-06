package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;

import java.util.List;

public interface OrderService extends BasicService<Order, Integer>{

    public List<Order> getOrdersByUserId(Integer userId);
    public List<DisplayedOrder> getDisplayedOrdersByUserId(Integer id);
    public DisplayedOrder convertToDisplayedOrder(Order order);
    @Deprecated
    public List<DisplayedOrder> convertToDisplayedOrders(List<Order> orders);
    public void delete(Integer id);
}
