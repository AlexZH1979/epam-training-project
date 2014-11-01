package ru.yandex.zhmyd.hotelmodel.repository.entity;

import java.util.List;

public class OrderHistoryEntity {
	
	private int id;
	private RoomOrder order;
	private List<EventEntity> events;

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

	public List<EventEntity> getEvents() {
		return events;
	}

	public void setEvents(List<EventEntity> events) {
		this.events = events;
	}
}
