package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.Order;

import java.util.List;

public interface OrderService extends BasicService<Order, Integer>{

    public List<Order> getOrdersByUserId(Long userId);
}
