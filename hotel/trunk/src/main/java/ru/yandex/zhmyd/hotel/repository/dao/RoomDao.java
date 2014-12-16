package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;

import java.util.List;

@SuppressWarnings("unused")
public interface RoomDao extends GenericDao<RoomEntity, Integer>{

    public List<OrderEntity> getOrdersByRoomId(Integer id);

    public List<RoomEntity> getFreeRooms(OrderEntity order);
}
