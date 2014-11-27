package ru.yandex.zhmyd.hotel.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "hotel_address_city")
public class HotelAddressCityEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "city_name")
    private String name;
}
