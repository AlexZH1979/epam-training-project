package ru.yandex.zhmyd.hotel.model;


/*
*This class present order in view
* have all displayed parameter, and not modified order
*One way transform Order->DisplayedOrder
 */
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

    public String getStartDate() {
        return order.getStartDate().toGMTString();
    }

    public String getEndDate() {
        return order.getEndDate().toGMTString();
    }

    public Boolean getConfirmed() {
        return order.getConfirmed();
    }

    public Integer getHotelId() {
        return order.getHotelId();
    }

    public RoomCategory getRoomCategory(){
        return  order.getRoomCategory();
    }

    public Integer getPlaces(){
        return order.getPlaces();
    }
}
