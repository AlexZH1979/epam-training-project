package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.DisplayedOrder;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.dao.OrderDao;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@SuppressWarnings("unused")
public class OrderServiceImpl extends AbstractServiceImpl<Order, OrderEntity, OrderDao, Integer> implements OrderService {

    private static final Logger LOG= Logger.getLogger(OrderServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Order> getOrdersByUserId(Integer id) {
        UserEntity userEntity=userDao.getById(id);
        Criterion criterion= Restrictions.eq("customer", userEntity);
        return Util.map(mapper, dao.getByCriteria(criterion), Order.class);
    }

    @Override
    public List<DisplayedOrder> getDisplayedOrdersByUserId(Integer id) {
        UserEntity userEntity = userDao.getById(id);
        Criterion criterion = Restrictions.eq("customer", userEntity);
        return Util.map(mapper, dao.getByCriteria(criterion), DisplayedOrder.class);
    }

    @Override
    public DisplayedOrder convertToDisplayedOrder(Order order) {
        DisplayedOrder displayedOrder = new DisplayedOrder(order);
        HotelEntity hotelEntity=hotelDao.getById(order.getHotelId());
        displayedOrder.setHotelName(hotelEntity.getName());
        UserEntity userEntity = userDao.getById(order.getCustomerId());
        displayedOrder.setUserFullName(userEntity.getFirstName() + " " + userEntity.getLastName());
        return displayedOrder;
    }

    @Override
    public List<DisplayedOrder> convertToDisplayedOrders(List<Order> orders) {
        List<DisplayedOrder> displayedOrders = new ArrayList<>(orders.size());
        //cyclic call this.convertToDisplayedOrder(Order order)
        for (Order order : orders) {
            displayedOrders.add(convertToDisplayedOrder(order));
        }
        return displayedOrders;
    }

    @Override
    public void delete(Integer id) throws ServiceException {
        LOG.debug("GET to delete id=" + id);
        //don't delete confirmed order
        if(getById(id).getConfirmed()){
            throw new ServiceException();
        }
        super.delete(id);
    }
}
