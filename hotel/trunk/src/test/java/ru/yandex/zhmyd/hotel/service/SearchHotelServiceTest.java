package ru.yandex.zhmyd.hotel.service;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.model.Hotel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;


public class SearchHotelServiceTest extends  AbstractDaoTest{

    private static final Logger LOG=Logger.getLogger(OrderServiceTest.class.getName());

    @Autowired
    private SearchHotelService searchHotelService;

    @Autowired
    private HotelService hotelService;

    @Test
    @Ignore
    public void testFindByCriteria(){
        //search by  get  random hotel (1-100), search it's by ID and assert unique and equals
        Random random=new Random(System.currentTimeMillis());
        int i=random.nextInt(100);
        Map<String, Object> param=new HashMap<>();
        Hotel hotel=hotelService.getInterval(1,100).get(i);
        param.put("id", hotel.getId());

        List<Hotel> hotels=searchHotelService.searchByParameters(param);
        Assert.assertEquals(1, hotels.size());
        Assert.assertEquals(hotel, hotels.get(0));
        LOG.info(hotel.toString());
    }

    @Test
    @Ignore
    public void getListStringsStates(){
        LOG.info(searchHotelService.getStatesToString().toString());
    }

    @Test
    public void getHotels(){
        LOG.info(searchHotelService.searchByAddressAssociation("state","MI").toString());
    }
}
