package ru.yandex.zhmyd.hotel.service;


import java.util.List;

public interface AddressService {

    List<String> getCounties(String value);

    List<String> getStates();

    //""->"state"->"county"->"city"->"zip"
    List<String> getNameSubParameters(String param, String value);
}
