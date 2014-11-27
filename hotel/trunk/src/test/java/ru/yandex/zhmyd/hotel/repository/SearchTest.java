package ru.yandex.zhmyd.hotel.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.HotelAddressDao;

import java.util.logging.Logger;

@Transactional
public class SearchTest extends AbstractDaoTest {

    private static final Logger LOG = Logger.getLogger(SearchTest.class.getName());

    @Autowired
    private HotelAddressDao addressDao;

    @Test
    public void getListStatesTest() {
        LOG.info(addressDao.getStates().toString());
    }
}
