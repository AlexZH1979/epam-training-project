package ru.yandex.zhmyd.hotel.model;

public class Order implements IOrder {

	private int id;
	private IReadUser user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IReadUser getUser() {
		return user;
	}

	public void setUser(IReadUser user) {
		this.user = user;
	}
}
