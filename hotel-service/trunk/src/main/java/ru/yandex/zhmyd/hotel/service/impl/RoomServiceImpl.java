package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.service.RoomService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@SuppressWarnings("unused")
//TODO
public class RoomServiceImpl extends AbstractServiceImpl<Room, RoomEntity, RoomDao, Integer> implements RoomService{

    private static final Logger LOG = Logger.getLogger(RoomServiceImpl.class);

    @Override
    public List<Room> getRoomsByHotel(Hotel hotel) {
        return null;
    }

    @Override
    public List<Room> getRoomsByHotel(Integer integer) {
        return null;
    }
}
