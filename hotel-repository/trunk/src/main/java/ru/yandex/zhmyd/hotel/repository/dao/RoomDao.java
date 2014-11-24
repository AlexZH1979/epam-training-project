package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;

import java.util.List;

@SuppressWarnings("unused")
public interface RoomDao extends GenericDao<RoomEntity, Integer>{

    public List<RoomOrderEntity> getOrdersByRoomId(Integer id);
}
