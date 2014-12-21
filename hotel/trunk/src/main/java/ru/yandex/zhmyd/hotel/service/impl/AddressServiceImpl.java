package ru.yandex.zhmyd.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;
import ru.yandex.zhmyd.hotel.service.AddressService;

import java.util.List;
@Transactional(readOnly = true)
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private HotelAddressDao addressDao;

    @Override
    public List<String> getCounties(String state) {
        return addressDao.getCounties(state);
    }

    @Override
    public List<String> getStates() {
        return addressDao.getStates();
    }

    //param->return type

    // ""->"state"->"county"->"city"->"zip"
    @Override
    public List<String> getNameSubParameters(String param, String value){
        return addressDao.getNameSubParameters(param, value);
    }
}
