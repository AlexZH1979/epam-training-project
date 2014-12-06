package ru.yandex.zhmyd.hotel.model;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class Order {

    private Long id;
    private RoomCategory roomCategory;
    private Integer price;
    private Integer roomId;
 private Integer places;
    @NotNull(message = "Hotel don\'t maybe empty")
    private Integer hotelId;
    @NotNull(message = "Customer don\'t maybe empty")
    private Integer customerId;
    @NotNull(message = "Order start date don\'t maybe empty")
    private Date startDate;
    @NotNull(message = "Order end date don\'t maybe empty")
    private Date endDate;
    private Boolean confirmed;

    public Long getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", customerId=" + customerId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", confirmed=" + confirmed +
                '}';
    }
}
