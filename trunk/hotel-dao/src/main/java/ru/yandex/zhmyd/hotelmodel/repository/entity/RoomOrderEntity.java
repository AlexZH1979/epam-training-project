package ru.yandex.zhmyd.hotelmodel.repository.entity;

import java.util.Date;

public class RoomOrderEntity {

	private Integer id;
	private Integer price;
	private RoomEntity room;
	private UserEntity customer;
	private Date startDate;
	private Date endDate;
	private Boolean confirmed;

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	public final RoomEntity getRoom() {
		return room;
	}

	public final void setRoom(RoomEntity room) {
		this.room = room;
	}

	public final UserEntity getCustomer() {
		return customer;
	}

	public final void setCustomer(UserEntity customer) {
		this.customer = customer;
	}

	public final Date getStartDate() {
		return startDate;
	}

	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public final Date getEndDate() {
		return endDate;
	}

	public final void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public final Boolean getConfirmed() {
		return confirmed;
	}

	public final void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}

}
