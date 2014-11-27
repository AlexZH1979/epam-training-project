package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;

import java.util.List;

@Repository
public class HotelDaoImpl extends AbstractHibernateDao<HotelEntity, Integer> implements HotelDao {

    @Override
    public List<HotelEntity> searchByAddressAssociation(String association, String name) {
        List<HotelEntity> cr = getSession().createCriteria(HotelEntity.class).createCriteria("hotelAddress")
                .createCriteria(association).add(Restrictions.eq("name", name)).list();
        return cr;
    }

    @Override
    public List<HotelEntity> searchByAddressAssociation(String association, String name, int begin, int count) {
        List<HotelEntity> cr = getSession().createCriteria(HotelEntity.class).createCriteria("hotelAddress")
                .createCriteria(association).add(Restrictions.eq("name", name))
                .setFirstResult(begin).setMaxResults(count).list();
        return cr;
    }
}
