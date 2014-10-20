package hotelmodel.dao;

import hotelmodel.domain.RoomOrder;
import hotelmodel.domain.User;

import java.util.List;

public interface RoomOrderDao {

	void saveRoomOrder(RoomOrder order);

	void updateRoomOrder(RoomOrder order);
	
	void deleteRoomOrder(RoomOrder order);

	RoomOrder getRoomOrderById(int id);
	
	RoomOrder getRoomOrderByUser(User user);
	
	List<RoomOrder> getRoomOrders();

}
