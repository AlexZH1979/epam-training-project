package ru.yandex.zhmyd.hotel.service.impl;

import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.service.HotelService;

@Service
public class HotelServiceImpl extends AbstractServiceImpl<Hotel, HotelEntity, HotelDao,Integer> implements HotelService{

}
