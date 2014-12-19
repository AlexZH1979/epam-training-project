package ru.yandex.zhmyd.hotel.service;


import ru.yandex.zhmyd.hotel.model.Hotel;

import java.util.List;

public interface SearchHotelService {

    public List<Hotel> searchByAddress(String association, String name, Integer begin, Integer count);

    public List<Hotel> searchByName(String name, Integer begin, Integer count);

    public Long lengthSearchByName(String name);

    public Long lengthSearchByAddress(String association, String name);
}
