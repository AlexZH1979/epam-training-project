package ru.yandex.zhmyd.hotel.repository.dao;


import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;

import java.util.List;

public interface HotelDao extends GenericDao<HotelEntity, Integer>{

    public List<HotelEntity> searchByAddressAssociation(String association, String name);
    public List<HotelEntity> searchByAddressAssociation(String association, String name, int begin, int count);
}
