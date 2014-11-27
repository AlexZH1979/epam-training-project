package ru.yandex.zhmyd.hotel.controler;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.web.HotelController;

import java.util.logging.Logger;

public class HotelControllerTest extends AbstractControllerTest{

    private static final Logger LOG =Logger.getLogger(HotelControllerTest.class.getName());

    @Autowired
    HotelController hotelController;

    @Test
    public void testAjaxGetStates(){
    LOG.info(hotelController.getStates().toString());
    }

    @Test
    public void searchTest(){
        //LOG.info(hotelController.searchHotelsByParameter("MI").toString());
        /*for(String st:hotelController.getStates()) {
            LOG.info(hotelController.lengthSearchHotelsByParameter(st, "state").toString());
        }*/
        LOG.info(hotelController.searchHotelsByParameter("MA", "state").toString());
    }
}
