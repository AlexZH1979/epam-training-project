package ru.yandex.zhmyd.hotel.service;


import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.model.Order;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class OrderServiceTest extends AbstractDaoTest {

    private static final Logger LOG = Logger.getLogger(OrderServiceTest.class.getName());

    @Autowired
    private OrderService orderService;

    @Ignore
    @Test
    public void test() {
        Order order=orderService.getById(1);
        LOG.info(order.toString());

        List<Order> orders=orderService.getOrdersByUserId(1);
        LOG.info(orders.toString());

        LOG.info(orderService.getAll().toString());

        Order order1=new Order();
        order1.setRoomId(1);
        order1.setCustomerId(20);
        order1.setStartDate(new Date());
        order1.setEndDate(new Date());
        order1.setPrice(300);
        order1.setConfirmed(false);
        orderService.save(order1);
    }

    @Test
    public void testInterval(){
        LOG.info("Get interval begin=3, count=5: "+orderService.getInterval(3,5));
    }
}

