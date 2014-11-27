package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.service.SearchHotelService;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@SuppressWarnings("unused")
public class SearchHotelServiceImpl implements SearchHotelService {

    private static final Logger LOG = Logger.getLogger(SearchHotelServiceImpl.class);

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private HotelAddressDao addressDao;

    @Autowired
    private Mapper mapper;

    //TODO
    @Override
    public List<Hotel> searchByParameters(Map<String, Object> param) {

        Criterion criterion=Restrictions.allEq(param);
        //TODO
        return Util.map(mapper, hotelDao.getByCriteria(criterion, 0, 100), Hotel.class);
    }

    @Override
    public List<String> getStatesToString() {
        return Util.map(mapper,addressDao.getStates(),String.class);
    }

    @Override
    public List<String> getCounties(String state) {
        return null;
    }

    //TODO
    @Override
    public List<Hotel> searchByAddressAssociation(String association, String name) {
        return Util.map(mapper,hotelDao.searchByAddressAssociation(association,name),Hotel.class);
    }


/*

    @Override
         public List<Hotel> searchByState(String name, int begin, int count) {
        return Util.map(mapper, hotelDao.searchByState(name).subList(1,3), Hotel.class);
    }

    @Override
    public List<Hotel> searchByState(String name) {
        return Util.map(mapper, hotelDao.searchByState(name), Hotel.class);
    }

    @Override
    public Integer searchByStateLength(String name) {
        return hotelDao.searchByState(name).size();
    }

    @Override
    public List<Hotel> searchByCounty(String name, int begin, int count) {
        return Util.map(mapper, hotelDao.searchByState(name).subList(1,3), Hotel.class);
    }

    @Override
    public List<Hotel> searchByCounty(String name) {
        return Util.map(mapper, hotelDao.searchByState(name), Hotel.class);
    }

    @Override
    public Integer searchByCountyLength(String name) {
        return hotelDao.searchByState(name).size();
    }*/
}
