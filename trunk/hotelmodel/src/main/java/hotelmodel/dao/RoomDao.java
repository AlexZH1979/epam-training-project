package hotelmodel.dao;

import hotelmodel.domain.Room;

import java.util.List;

public interface RoomDao {

	void saveRoom(Room room);

	void deleteRoom(Room room);

	void updateRoom(Room room);

	Room getRoomById(int id);

	List<Room> getRooms();

}
