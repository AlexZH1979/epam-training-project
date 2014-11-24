package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.Hotel;

import java.util.List;

public interface HotelService extends BasicService<Hotel, Integer>{

    //TODO
    public List<Hotel> getHotelByLocale();
}
