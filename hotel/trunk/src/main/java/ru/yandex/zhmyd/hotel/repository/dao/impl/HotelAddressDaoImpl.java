package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelAddressEntity;
import ru.yandex.zhmyd.hotel.repository.entity.HotelAddressStateEntity;

import java.util.List;

@Repository
public class HotelAddressDaoImpl extends AbstractHibernateDao<HotelAddressEntity, Integer> implements HotelAddressDao{

    @Override
    public List<HotelAddressStateEntity> getStates() {
        return getSession().createCriteria(HotelAddressStateEntity.class).list();
    }
}
