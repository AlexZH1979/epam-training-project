package ru.yandex.zhmyd.hotelmodel.dao;

import java.util.List;

import ru.yandex.zhmyd.hotelmodel.domain.RoomOrder;
import ru.yandex.zhmyd.hotelmodel.domain.User;

public interface RoomOrderDao {

	void saveRoomOrder(RoomOrder order);

	void updateRoomOrder(RoomOrder order);
	
	void deleteRoomOrder(RoomOrder order);

	RoomOrder getRoomOrderById(int id);
	
	RoomOrder getRoomOrderByUser(User user);
	
	List<RoomOrder> getRoomOrders();

}
