package ru.yandex.zhmyd.hotel.repository.entity;

import org.dozer.Mapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "room_order")
public class RoomOrderEntity {

    @Id
    @Mapping("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;

    @Mapping("price")
    @Column(name = "price")
	private Integer price;

    @ManyToOne(targetEntity = RoomEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
	private RoomEntity room;

    @ManyToOne(targetEntity = UserEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	private UserEntity customer;

    @Mapping("startDate")
    @Column(name = "start_date")
	private Date startDate;

    @Mapping("endDate")
    @Column(name = "end_date")
	private Date endDate;

    @Mapping("confirmed")
    @Column(name = "confurmed")
	private Boolean confirmed;

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final Integer getPrice() {
		return price;
	}

	public final void setPrice(Integer price) {
		this.price = price;
	}

	public final RoomEntity getRoom() {
		return room;
	}

	public final void setRoom(RoomEntity room) {
		this.room = room;
	}

	public final UserEntity getCustomer() {
		return customer;
	}

	public final void setCustomer(UserEntity customer) {
		this.customer = customer;
	}

	public final Date getStartDate() {
		return startDate;
	}

	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public final Date getEndDate() {
		return endDate;
	}

	public final void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public final Boolean getConfirmed() {
		return confirmed;
	}

	public final void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}

}