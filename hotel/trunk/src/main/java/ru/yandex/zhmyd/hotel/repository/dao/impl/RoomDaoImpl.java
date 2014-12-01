package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;

import java.util.List;

@Repository
@SuppressWarnings("unused,unchecked")
public class RoomDaoImpl extends AbstractHibernateDao<RoomEntity, Integer> implements RoomDao {
    @Override
    public List<OrderEntity> getOrdersByRoomId(Integer id) {
        Criteria criteria=getSession().createCriteria(OrderEntity.class);
        Criteria roomCriteria=criteria.createCriteria("room");
        roomCriteria.add(Restrictions.eq("id", id));
        return criteria.list();
    }

    @Override
    @Deprecated
    public List<RoomEntity> getAll(){
        throw new UnsupportedOperationException("Don't support for "+RoomEntity.class+", cause - very bad performance. Use List<T> getByCriteria(Criterion criterion, int begin, int count);");
    }
}
