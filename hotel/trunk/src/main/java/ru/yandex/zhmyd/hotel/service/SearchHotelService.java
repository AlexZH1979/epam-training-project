package ru.yandex.zhmyd.hotel.service;


import ru.yandex.zhmyd.hotel.model.Hotel;

import java.util.List;
import java.util.Map;

public interface SearchHotelService {

    /**
     *
     * @param param
     * @return
     */
    public List<Hotel> searchByParameters(Map<String, Object> param);
    public List<String> getStatesToString();
    public List<String> getCounties(String state);

    public List<Hotel> searchByAddressAssociation(String association, String name);


 /*   List<Hotel> searchByCounty(String name, int begin, int count);

    List<Hotel> searchByCounty(String name);

    Integer searchByCountyLength(String name);

    public List<Hotel> searchByState(String name, int begin,int count);
    public List<Hotel> searchByState(String name);

    public Integer searchByStateLength(String name);*/
}
