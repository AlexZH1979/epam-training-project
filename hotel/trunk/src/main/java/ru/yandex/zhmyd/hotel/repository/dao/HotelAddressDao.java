package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.HotelAddressEntity;
import ru.yandex.zhmyd.hotel.repository.entity.HotelAddressStateEntity;

import java.util.List;

public interface HotelAddressDao extends GenericDao<HotelAddressEntity,Integer>{
    public List<HotelAddressStateEntity> getStates();
}
