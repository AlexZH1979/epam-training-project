package ru.yandex.zhmyd.hotelmodel.repository.entity;

import ru.yandex.zhmyd.hotelmodel.repository.enumerated.EventStatus;

public class EventEntity {

	private int id;
	private EventStatus status;;
	private String description;
	private UserEntity adminisrtator;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final EventStatus getStatus() {
		return status;
	}

	public final void setStatus(EventStatus status) {
		this.status = status;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final UserEntity getAdminisrtator() {
		return adminisrtator;
	}

	public final void setAdminisrtator(UserEntity adminisrtator) {
		this.adminisrtator = adminisrtator;
	}

}
