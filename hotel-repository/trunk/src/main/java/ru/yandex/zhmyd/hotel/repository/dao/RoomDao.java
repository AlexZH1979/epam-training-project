package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;

import java.util.List;

/**
 * Created by Александр on 10.11.2014.
 */
public interface RoomDao extends GenericDao<RoomEntity, Integer>{
    public List<RoomOrderEntity> getOrdersByRoomId(Integer id);
}
