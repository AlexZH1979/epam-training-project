package ru.yandex.zhmyd.hotel.repository.dao;

import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

/**
 * Created by Александр on 10.11.2014.
 */
public interface RoomOrderDao extends GenericDao<RoomOrderEntity, Integer> {
    public UserEntity getUserByOrderId(Integer roomOrderId);
    public RoomEntity getRoomByOrderId(Integer roomOrderId);
}
