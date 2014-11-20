package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.service.SearchRoomService;

import java.util.HashMap;
import java.util.List;

@Service
public class SearchRoomServiceImpl implements SearchRoomService {

    private static final Logger LOG = Logger.getLogger(SearchRoomServiceImpl.class);

    @Autowired
    private Mapper mapper;

    //TODO
    @Override
    public List<Room> searchByParameters(HashMap<String, Object> stringObjectHashMap) {
        return null;
    }
}
