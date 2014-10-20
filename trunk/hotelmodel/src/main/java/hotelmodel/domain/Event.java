package hotelmodel.domain;

public class Event {
	
	private int id;
	private EventStatus status = EventStatus.UNCNOWN;
	private String description;
	private User adminisrtator;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EventStatus getStatus() {
		return status;
	}

	public void setStatus(EventStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getAdminisrtator() {
		return adminisrtator;
	}

	public void setAdminisrtator(User adminisrtator) {
		this.adminisrtator = adminisrtator;
	}
}
