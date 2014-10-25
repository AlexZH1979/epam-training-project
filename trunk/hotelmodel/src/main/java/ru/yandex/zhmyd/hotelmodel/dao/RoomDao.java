package ru.yandex.zhmyd.hotelmodel.dao;

import java.util.List;

import ru.yandex.zhmyd.hotelmodel.domain.Room;

public interface RoomDao {

	void saveRoom(Room room);

	void deleteRoom(Room room);

	void updateRoom(Room room);

	Room getRoomById(int id);

	List<Room> getRooms();

}
