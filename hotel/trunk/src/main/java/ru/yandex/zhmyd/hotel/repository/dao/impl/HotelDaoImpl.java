package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;

@Repository
public class HotelDaoImpl extends AbstractHibernateDao<HotelEntity, Integer> implements HotelDao {

}
