package ru.yandex.zhmyd.hotel.model;


import java.util.Date;

public class DisplayedOrder {
    private Order order;
    private String userFullName;
    private String hotelName;

    public DisplayedOrder(Order order){
        this.order=order;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Long getId() {
        return order.getId();
    }

    public Integer getPrice() {
        return order.getPrice();
    }

    public Integer getRoomId() {
        return order.getRoomId();
    }

    public Integer getCustomerId() {
        return order.getCustomerId();
    }

    public Date getStartDate() {
        return order.getStartDate();
    }

    public Date getEndDate() {
        return order.getEndDate();
    }

    public Boolean getConfirmed() {
        return order.getConfirmed();
    }

    public Integer getHotelId() {
        return order.getHotelId();
    }

}
