package ru.yandex.zhmyd.hotel.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.repository.entity.OrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomCategoryEntity;

import java.util.Date;

@Transactional
public class RoomDaoTest extends AbstractDaoTest{

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private HotelDao hotelDao;

    @Test
    public void getFreeRooms(){
        OrderEntity order=new OrderEntity();
        HotelEntity hotelEntity=hotelDao.getById(269);

        Date date=new Date();
        date.setYear(114);
        date.setMonth(11);
        date.setDate(10);
        order.setStartDate(date);

        date=new Date();
        date.setYear(114);
        date.setMonth(11);
        date.setDate(11);
        order.setEndDate(date);
        order.setPlaces((byte) 1);
        order.setRoomCategory(RoomCategoryEntity.BUSINESS);
        order.setHotel(hotelEntity);
        String stringDate="---------"+(1900+date.getYear())+"-"+(1+date.getMonth())+"-"+date.getDate();
        System.out.println(stringDate);
        System.out.println(date);

        System.out.println(roomDao.getFreeRooms(order));
    }
}
