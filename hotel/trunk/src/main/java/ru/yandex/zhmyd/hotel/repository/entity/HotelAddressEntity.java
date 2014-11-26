package ru.yandex.zhmyd.hotel.repository.entity;

import org.dozer.Mapping;

import javax.persistence.*;

@Entity
@Table(name = "hotel_geo_address")
@SuppressWarnings("unused")
public class HotelAddressEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Mapping("id")
    private Integer id;

    @Column(name = "address")
    @Mapping("address")
    private String address;

    @Column(name = "city")
    @Mapping("city")
    private String city;

    @Column(name = "state")
    @Mapping("state")
    private String state;

    @Column(name = "zip")
    @Mapping("zip")
    private Integer zip;

    @ManyToOne(targetEntity = HotelAddressCountyEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "county_id")
    @Mapping("county")
    private HotelAddressCountyEntity county;

    @Column(name = "area_code")
    @Mapping("areaCode")
    private Integer areaCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }


    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public HotelAddressCountyEntity getCounty() {
        return county;
    }

    public void setCounty(HotelAddressCountyEntity county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "HotelAddressEntity{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", county=" + county +
                ", areaCode=" + areaCode +
                '}';
    }
}
