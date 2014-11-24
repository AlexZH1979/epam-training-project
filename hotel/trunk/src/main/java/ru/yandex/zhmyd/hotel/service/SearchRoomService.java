package ru.yandex.zhmyd.hotel.service;


import ru.yandex.zhmyd.hotel.model.Order;
import ru.yandex.zhmyd.hotel.model.Room;

import java.util.List;
import java.util.Map;

public interface SearchRoomService {

    /**
     *
     * @param param
     *      values:
     *      "hotelId"
     *      "category"
     *      "size"
     *      "startDate"
     *      "endDate"
     *      "maxPrice"
     * @return List rooms finding by parameter
     */
    public List<Room> searchByParameters(Map<String, Object> param);

    /**
     *
     * @param order -example order, with associated variable room.hotel.id
     * @return
     */
    public List<Room> searchByParameters(Order order);

    public List<Room> searchByParameters(Order order, Integer hotelId);
}
