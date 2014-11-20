package ru.yandex.zhmyd.hotel.model;

import java.lang.Boolean;import java.lang.Integer;import java.lang.Long;import java.util.Date;


public class Order {

    private Long id;
    private Integer price;
    private Integer roomId;
    private Long customerId;
    private Date startDate;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", roomId=" + roomId +
                ", customerId=" + customerId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", confirmed=" + confirmed +
                '}';
    }
}
