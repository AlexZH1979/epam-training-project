package ru.yandex.zhmyd.hotel.model;

public class Room {

	private Integer id;
	private String roomName;
	
	private Byte size;
	private Integer pricePerDay;
	private String description;
    private RoomCategory category;

    public String getRoomName() {
        return roomName;
    }

    public RoomCategory getCategory() {
        return category;
    }

    public void setCategory(RoomCategory category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Byte getSize() {
        return size;
    }

    public void setSize(Byte size) {
        this.size = size;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", size=" + size +
                ", pricePerDay=" + pricePerDay +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }
}