package ru.yandex.zhmyd.hotelmodel.service;

import java.util.Date;
import java.util.List;

import ru.yandex.zhmyd.hotelmodel.domain.Room;
import ru.yandex.zhmyd.hotelmodel.domain.RoomCategory;

public interface SearchRoomService {

	List<Room> getBySise(int size);

	List<Room> getByClass(RoomCategory roomClass);

	List<Room> getByPrice(int minPrice, int maxPrice);
	
	List<Room> getByRentPeriod(Date startRent, Date endRent);
}
