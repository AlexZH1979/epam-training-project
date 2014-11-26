package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelAddressEntity;

@Repository
public class HotelAddressDaoImpl extends AbstractHibernateDao<HotelAddressEntity, Integer> implements HotelAddressDao{
}
