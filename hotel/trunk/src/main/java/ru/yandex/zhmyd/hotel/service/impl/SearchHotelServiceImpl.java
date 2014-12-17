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
import ru.yandex.zhmyd.hotel.service.util.mapper.Util;

import java.util.List;
import static ru.yandex.zhmyd.hotel.repository.dao.util.SearchParameter.NAME;

@Service
@Transactional
public class SearchHotelServiceImpl implements SearchHotelService {

    private static final Logger LOG = Logger.getLogger(SearchHotelServiceImpl.class);

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private HotelAddressDao addressDao;

    @Autowired
    private Mapper mapper;

    @Override
    public List<String> getStates() {
        return Util.map(mapper,addressDao.getStates(),String.class);
    }

    //TODO
    @Override
    public List<String> getCounties(String state) {
        throw new RuntimeException("TODO");
    }

    //TODO
    @Override
    public List<Hotel> searchByAddress(String association, String name,Integer begin, Integer count) {
        switch (association) {
            case "address":
                return Util.map(mapper, hotelDao.searchLikeAddress(name), Hotel.class);
            case "state":
                return Util.map(mapper, hotelDao.searchAddressAssociation(association, name, begin, count), Hotel.class);
            case "city":
            case "county":
                return Util.map(mapper, hotelDao.searchLikeAddressAssociation(association, name, begin, count), Hotel.class);
            default:
                throw new IllegalArgumentException("Parameter " + association + "don't acceptable first param 'association'" +
                        " for searchByAddress(String association, String name)");
        }
    }

    @Override
    public List<Hotel> searchByName(String name, Integer begin, Integer count) {
        return Util.map(mapper, hotelDao.getByCriteria(getCriterionForLikeName(name), begin, count), Hotel.class);
    }

    @Override
    public Long lengthSearchByName(String name) {
        return hotelDao.getLength(getCriterionForLikeName(name));
    }

    @Override
    public Long lengthSearchByAddress(String association, String name) {
        switch (association) {
            case "address":
                return Long.valueOf(hotelDao.lengthSearchLikeAddress(name));
            case "state":
                return Long.valueOf(hotelDao.lengthSearchAddressAssociation(association, name));
            case "city":
            case "county":
                return Long.valueOf(hotelDao.lengthSearchLikeAddressAssociation(association, name));
            default:
                throw new IllegalArgumentException("Parameter " + association + "don't acceptable first param 'association'" +
                        " for searchByAddress(String association, String name)");
        }
    }

    private Criterion getCriterionForLikeName(String name){
        return Restrictions.or(Restrictions.like(NAME, "% " + name + "%"),
                Restrictions.like(NAME, name + "%"));
    }
}
