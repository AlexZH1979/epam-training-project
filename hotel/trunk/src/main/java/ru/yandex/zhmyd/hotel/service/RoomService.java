package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.model.Room;

import java.util.List;

public interface RoomService extends BasicService<Room, Integer>{
    public List<Room> getRoomsByHotel(Hotel hotel);

    public List<Room> getRoomsByHotel(Integer id);
}
