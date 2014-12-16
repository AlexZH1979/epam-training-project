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
import ru.yandex.zhmyd.hotel.service.exceptions.EntityNonFoundException;
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
    public List<Order> getIntervalOrdersByUserId(Integer id, Integer begin, Integer count) {
        UserEntity userEntity=userDao.getById(id);
        Criterion criterion= Restrictions.eq("customer", userEntity);
        return Util.map(mapper, dao.getByCriteria(criterion, begin, count), Order.class);
    }


    @Override
    public List<Order> getIntervalOrdersByHotelId(Integer hotelId, Integer begin, Integer count) {
        HotelEntity userEntity=hotelDao.getById(hotelId);
        Criterion criterion= Restrictions.eq("hotel", userEntity);
        return Util.map(mapper, dao.getByCriteria(criterion, begin, count), Order.class);
    }

    //TODO mapper
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
        for (Order order : orders) {
            displayedOrders.add(convertToDisplayedOrder(order));
        }
        return displayedOrders;
    }

    @Override
    public void delete(Integer id) throws ServiceException {
        LOG.info("GET to delete id=" + id);
        //don't delete confirmed order
        //if not found -> nothing
        // (if found) AND (administrator don't work witch his OR it's non confirm)->delete; else throw
        Order order=getById(id);
        if (order != null) {
            if (order.getConfirmed() == null || !order.getConfirmed()) {
                LOG.info("ORDER with id=" + id + " delete");
                //throw new ServiceException();
                super.delete(id);
            } else {
                LOG.info("ORDER with id=" + id + " don\'t delete, cause - order confirm=true");
                throw new ServiceException();
            }
        }else{
            LOG.info("ORDER with id=" + id + " don\'t found");
            throw new EntityNonFoundException("ORDER with id=" + id + " don\'t found");
        }
    }
}
