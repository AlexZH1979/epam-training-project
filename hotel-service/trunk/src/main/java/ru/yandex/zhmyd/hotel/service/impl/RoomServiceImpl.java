package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.service.RoomService;

@Service
@Transactional
public class RoomServiceImpl extends AbstractServiceImpl<Room, RoomEntity, RoomDao, Integer> implements RoomService{

    private static final Logger LOG = Logger.getLogger(RoomServiceImpl.class);
}
