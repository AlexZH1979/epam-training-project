package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.OrderDao;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

@Repository
@SuppressWarnings("unused")
public class OrderDaoImpl extends AbstractHibernateDao<OrderEntity, Integer> implements OrderDao {

    @Override
    public UserEntity getUserByOrderId(Integer id) {

        OrderEntity order = (OrderEntity) getSession().get(OrderEntity.class, id);
        UserEntity user=order.getCustomer();
        Hibernate.initialize(user);
        return user;
    }

    @Override
    public RoomEntity getRoomByOrderId(Integer id){
        OrderEntity order=(OrderEntity) getSession().get(OrderEntity.class, id);
        RoomEntity room=order.getRoom();
        Hibernate.initialize(room);
        return room;
    }
}
