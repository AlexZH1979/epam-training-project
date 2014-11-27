package ru.yandex.zhmyd.hotel.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;

import java.util.logging.Logger;

@Transactional
public class HotelDaoTest extends AbstractDaoTest {

    private static final Logger LOG = Logger.getLogger(HotelDaoTest.class.getName());

    @Autowired
    private HotelDao hotelDao;


    @Test
    public void loadHotel() {
        HotelEntity hotel = hotelDao.getById(1);
        LOG.info(hotel.toString());

        LOG.info("COUNT: " + hotelDao.getLength());

    }

    @Test
    public void searchByAddressAssociation(){
        LOG.info(hotelDao.searchByAddressAssociation("state","MI", 5, 50).toString());
        LOG.info(hotelDao.searchByAddressAssociation("city","Dublin", 5, 50).toString());
    }

}
