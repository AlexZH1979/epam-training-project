package ru.yandex.zhmyd.hotel.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.model.Hotel;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class SearchRoomServiceTest extends  AbstractDaoTest{

    private static final Logger LOG=Logger.getLogger(OrderServiceTest.class.getName());

    @Autowired
    private SearchRoomService searchRoomService;

    @Autowired
    private HotelService hotelService;

    @Test
    public void testFindByCriteria(){
        //говнокодище - но работает правильно !!! и это хорошо (спс system.out.ptintln)
        Map<String, Object> param=new HashMap<>();
       // param.put("size", (byte)2);
        Hotel hotel=hotelService.getHotelByLocale().get(0);
        System.out.println(hotel.getId());
        param.put("hotel.id", hotel.getId());
        System.out.println(searchRoomService.searchByParameters(param));
    }
}
