package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.RoomOrderDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;


@Repository
public class RoomOrderDaoImpl extends AbstractHibernateDao<RoomOrderEntity, Integer> implements RoomOrderDao {

    @Override
    public UserEntity getUserByOrderId(Integer id) {

        RoomOrderEntity order = (RoomOrderEntity) getSession().get(RoomOrderEntity.class, id);
        UserEntity user=order.getCustomer();
        Hibernate.initialize(user);
        return user;
    }

    @Override
    public RoomEntity getRoomByOrderId(Integer id){
        RoomOrderEntity order=(RoomOrderEntity) getSession().get(RoomOrderEntity.class, id);
        RoomEntity room=order.getRoom();
        Hibernate.initialize(room);
        return room;
    }
}
