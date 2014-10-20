package hotelmodel.service;

import hotelmodel.domain.Room;

import java.util.List;

public interface SearchRoomService {
	
	List<Room> getBySise();
	
	List<Room> getByPrice(int minPrice, int maxPrice);
}
