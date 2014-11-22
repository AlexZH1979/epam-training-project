package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.service.SearchRoomService;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@SuppressWarnings("unused")
public class SearchRoomServiceImpl implements SearchRoomService {

    private static final Logger LOG = Logger.getLogger(SearchRoomServiceImpl.class);

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private Mapper mapper;

    //TODO
    @Override
    public List<Room> searchByParameters(Map<String, Object> param) {

        Criterion criterion=Restrictions.allEq(param);
        //TODO
        return Util.map(mapper,roomDao.getByCriteria(criterion, 0, 100),Room.class);
    }

    @Override
    public List<Room> searchByParameters(Order order) {
        return null;
    }

    @Override
    public List<Room> searchByParameters(Order order, Integer integer) {
        return null;
    }
}
