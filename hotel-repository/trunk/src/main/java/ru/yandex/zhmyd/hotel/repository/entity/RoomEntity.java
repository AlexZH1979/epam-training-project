package ru.yandex.zhmyd.hotel.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class RoomEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String roomName;

    @Column(name = "size")
    private Byte size;

    @Column(name = "price")
    private Integer price;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "category")
    private RoomCategoryEntity category;

    @OneToMany(targetEntity = RoomOrderEntity.class, mappedBy = "room",fetch = FetchType.LAZY)
    private List<RoomOrderEntity> roomOrders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoomCategoryEntity getCategory() {
        return category;
    }

    public void setCategory(RoomCategoryEntity category) {
        this.category = category;
    }

    public List<RoomOrderEntity> getRoomOrders() {
        return roomOrders;
    }

    public void setRoomOrders(List<RoomOrderEntity> roomOrders) {
        this.roomOrders = roomOrders;
    }

    @Override
    public String toString(){
        return "Room: id="+id+", name="+roomName+", size="+size+", price="+price+", category="+category;
    }
}
