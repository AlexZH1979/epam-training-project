package hotelmodel.model;

import java.util.List;

public class OrderHistory {
	
	private int id;
	private RoomOrder order;
	private List<Event> events;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomOrder getOrder() {
		return order;
	}

	public void setOrder(RoomOrder order) {
		this.order = order;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
