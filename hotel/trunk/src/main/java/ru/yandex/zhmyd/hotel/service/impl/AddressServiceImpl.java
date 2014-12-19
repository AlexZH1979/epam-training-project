package ru.yandex.zhmyd.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;
import ru.yandex.zhmyd.hotel.service.AddressService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    private HotelAddressDao addressDao;

    @Override
    public List<String> getCounties(String value) {
        return addressDao.getCounties(value);
    }

    @Override
    public List<String> getStates() {
        return addressDao.getStates();
    }

    //""->"state"->"county"->"city"->"zip"
    @Override
    public List<String> getNameSubParameters(String param, String value){
        return addressDao.getNameSubParameters(param, value);
    }
}
