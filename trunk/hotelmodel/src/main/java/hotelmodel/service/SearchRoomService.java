package hotelmodel.service;

import hotelmodel.domain.Room;
import hotelmodel.domain.RoomClass;

import java.util.Date;
import java.util.List;

public interface SearchRoomService {

	List<Room> getBySise(int size);

	List<Room> getByClass(RoomClass roomClass);

	List<Room> getByPrice(int minPrice, int maxPrice);
	
	List<Room> getByRentPeriod(Date startRent, Date endRent);
}
