package ru.yandex.zhmyd.hotel.service.test;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.service.SearchRoomService;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SearchRoomServiceTest extends  AbstractDaoTest{

    private static final Logger LOG=Logger.getLogger(OrderServiceTest.class.getName());

    @Autowired
    private SearchRoomService searchRoomService;

    @Test
    public void testFindByCriteria(){
        //говнокодище - но работает правильно !!! и это хорошо (спс system.out.ptintln)
        Map<String, Object> param=new HashMap<>();
        param.put("size", (byte)2);
        HotelEntity hotelEntity=new HotelEntity();
        hotelEntity.setId(20);
        param.put("hotel", hotelEntity);
        System.out.println(searchRoomService.searchByParameters(param));
    }
}
