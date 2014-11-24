package ru.yandex.zhmyd.hotel.model;

public class HotelLocation {

    private Integer id;

    private Integer locFIPS;

    private String locTimeZone;

    private String locDST;

    private Double locLat;

    private Double locLong;

    private Integer longMSA;

    private String locPMSA;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocFIPS() {
        return locFIPS;
    }

    public void setLocFIPS(Integer locFIPS) {
        this.locFIPS = locFIPS;
    }

    public String getLocTimeZone() {
        return locTimeZone;
    }

    public void setLocTimeZone(String locTimeZone) {
        this.locTimeZone = locTimeZone;
    }

    public String getLocDST() {
        return locDST;
    }

    public void setLocDST(String locDST) {
        this.locDST = locDST;
    }

    public Double getLocLat() {
        return locLat;
    }

    public void setLocLat(Double locLat) {
        this.locLat = locLat;
    }

    public Double getLocLong() {
        return locLong;
    }

    public void setLocLong(Double locLong) {
        this.locLong = locLong;
    }

    public Integer getLongMSA() {
        return longMSA;
    }

    public void setLongMSA(Integer longMSA) {
        this.longMSA = longMSA;
    }

    public String getLocPMSA() {
        return locPMSA;
    }

    public void setLocPMSA(String locPMSA) {
        this.locPMSA = locPMSA;
    }
}
