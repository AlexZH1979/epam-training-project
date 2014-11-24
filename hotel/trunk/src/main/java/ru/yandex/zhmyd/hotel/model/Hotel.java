package ru.yandex.zhmyd.hotel.model;


public class Hotel {

    private Integer id;

    private HotelCategory category;

    private String name;

    private HotelAddress hotelAddress;

    private HotelLocation hotelLocation;

    public Integer getId() {
        return id;
    }

    public HotelAddress getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(HotelAddress hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public HotelLocation getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(HotelLocation hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HotelCategory getCategory() {
        return category;
    }

    public void setCategory(HotelCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
