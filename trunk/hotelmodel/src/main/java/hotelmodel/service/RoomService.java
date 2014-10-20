package hotelmodel.service;

import hotelmodel.domain.Room;

import java.util.List;

public interface RoomService {

	void saveRoom(Room room);

	void deleteRoom(Room room);

	void updateRoom(Room room);

	Room getRoomById(int id);

	List<Room> getRooms();

}
