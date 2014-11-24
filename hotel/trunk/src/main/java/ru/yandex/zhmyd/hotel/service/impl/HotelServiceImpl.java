package ru.yandex.zhmyd.hotel.service.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.service.HotelService;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.util.List;

@Service
public class HotelServiceImpl extends AbstractServiceImpl<Hotel, HotelEntity, HotelDao,Integer> implements HotelService{

    @Autowired
    private HotelDao hotelDao;
    @Override
    public List<Hotel> getHotelByLocale() {
        return Util.map(mapper, hotelDao.getByCriteria(Restrictions.eq("name", "Greyhouse Inn B&B")), Hotel.class);
    }
}
