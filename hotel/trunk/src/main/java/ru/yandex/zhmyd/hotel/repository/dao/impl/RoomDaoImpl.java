package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
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

    private static final Logger LOG=Logger.getLogger(RoomDaoImpl.class);

    @Override
    public List<OrderEntity> getOrdersByRoomId(Integer id) {
        Criteria criteria=getSession().createCriteria(OrderEntity.class);
        Criteria roomCriteria=criteria.createCriteria("room");
        roomCriteria.add(Restrictions.eq("id", id));
        return criteria.list();
    }

    //TODO

    /*
     *
     * select * from (select * from room where room.size=1 and room.hotel_id=269) as r left join (SELECT * FROM room_order o where hotel_id=269 and
     * not((o.start_date<'2014-12-10' and o.end_date<'2014-12-10')
     * or (o.start_date>'2014-12-11' and o.end_date>'2014-12-11'))) as t on r.id=t.room_id where t.id is null;
     */
    @Override
    public List<RoomEntity> getFreeRooms(OrderEntity order) {
        String hql =" SELECT R FROM RoomEntity R WHERE R.hotel=:hotel";
        Query query=getSession().createQuery(hql);
       // query.setParameter("sizze", order.getPlaces());
        query.setParameter("hotel", order.getHotel());
       // query.setParameter("category", order.getRoomCategory());
        List<RoomEntity> allRooms=query.list();
        LOG.info("[FIND allRooms BY QUERY size="+order.getPlaces()+" hotelId="+order.getHotel().getId()+" category="+order.getRoomCategory()+"]="+allRooms);
        hql ="SELECT O.room FROM OrderEntity O WHERE O.hotel=:hotel AND NOT " +
                "((O.startDate<:startDate AND O.endDate<:startDate) OR (O.startDate>:endDate AND O.endDate>:endDate))";
        query=getSession().createQuery(hql);
        query.setParameter("startDate", order.getStartDate());
        query.setParameter("endDate", order.getEndDate());
        query.setParameter("hotel", order.getHotel());
        List<RoomEntity> excludeRooms=query.list();
        LOG.info("[FIND excludeRooms BY QUERY startDate="+order.getStartDate()+" endDate"+order.getEndDate()+"]="+excludeRooms);
        allRooms.removeAll(excludeRooms);

        return allRooms;
    }

    @Override
    @Deprecated
    public List<RoomEntity> getAll(){
        throw new UnsupportedOperationException("Don't support for "+RoomEntity.class+", cause - very bad performance. Use List<T> getByCriteria(Criterion criterion, int begin, int count);");
    }
}
