package ru.yandex.zhmyd.hotel.repository.entity;

import org.dozer.Mapping;

import javax.persistence.*;

@Entity
@Table(name = "hotel_geo_location")
@SuppressWarnings("unused")
public class HotelLocationEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Mapping("id")
    private Integer id;

    @Column(name = "loc_FIPS")
    @Mapping("locFIPS")
    private Integer locFIPS;

    @Column(name = "loc_TimeZone")
    @Mapping("locTimeZone")
    private String locTimeZone;

    @Column(name = "loc_DST")
    @Mapping("locDST")
    private String locDST;

    @Column(name = "loc_Lat")
    @Mapping("locLat")
    private Double locLat;

    @Column(name = "loc_Long")
    @Mapping("locLong")
    private Double locLong;

    @Column(name = "long_MSA")
    @Mapping("longMSA")
    private Integer longMSA;

    @Column(name = "loc_PMSA")
    @Mapping("locPMSA")
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

    @Override
    public String toString() {
        return "HotelLocationEntity{" +
                "id=" + id +
                ", locFIPS=" + locFIPS +
                ", locTimeZone='" + locTimeZone + '\'' +
                ", locDST='" + locDST + '\'' +
                ", locLat=" + locLat +
                ", locLong=" + locLong +
                ", longMSA=" + longMSA +
                ", locPMSA='" + locPMSA + '\'' +
                '}';
    }
}
