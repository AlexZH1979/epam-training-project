package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;

import java.util.List;

@Repository
public class RoomDaoImpl extends AbstractHibernateDao<RoomEntity, Integer> implements RoomDao {
    @Override
    public List<RoomOrderEntity> getOrdersByRoomId(Integer id) {
        Criteria criteria=getSession().createCriteria(RoomOrderEntity.class);
        Criteria roomCriteria=criteria.createCriteria("room");
        roomCriteria.add(Restrictions.eq("id", id));
        List<RoomOrderEntity> orders=criteria.list();
        return orders;
    }
}
