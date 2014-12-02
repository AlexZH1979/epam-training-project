package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.repository.dao.OrderDao;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;
import ru.yandex.zhmyd.hotel.service.OrderService;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.util.List;

@Service
@Transactional
@SuppressWarnings("unused")
public class OrderServiceImpl extends AbstractServiceImpl<Order, OrderEntity, OrderDao, Integer> implements OrderService {

    private static final Logger LOG= Logger.getLogger(OrderServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<Order> getOrdersByUserId(Integer id) {
        //TODO
        UserEntity userEntity=userDao.getById(id);
        Criterion criterion= Restrictions.eq("customer", userEntity);
        return Util.map(mapper, dao.getByCriteria(criterion), Order.class);
    }
}
