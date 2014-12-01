package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;

import java.util.List;

@SuppressWarnings("unused")
public interface RoomDao extends GenericDao<RoomEntity, Integer>{

    public List<OrderEntity> getOrdersByRoomId(Integer id);
}
