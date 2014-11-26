package ru.yandex.zhmyd.hotel.repository;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.RoomOrderDao;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

import java.util.List;
import java.util.logging.Logger;

@Transactional
public class UserDaoTest extends AbstractDaoTest {
    private static final Logger LOG = Logger.getLogger(UserDaoTest.class.getName());
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoomOrderDao roomOrderDao;


    @Test
    public void test() {
        UserEntity savedUser = userDao.getById(20L);
        LOG.info("USER BY ID=20L: " + savedUser);

        savedUser = userDao.getByCredentials("root", 3506402);
        LOG.info("FIND BY CREDENTIALS login:[passHashcode:3506402<-password:root)]: "+savedUser);

        List<UserEntity> users = userDao.getAll();
        LOG.info("Find all: length="+users.size()+"; Entity: "+users);

        LOG.info("ORDERS for roomId=1: "+roomOrderDao.getRoomByOrderId(1));

        LOG.info("SUBSEQUENSE Users with NULL Criteria: " + userDao.getByCriteria(null, 5, 10));

    }

    @Test
    public void lazyLoadFiled() {
        //TODO review code
        /*
        *   Evil lazy-load problem won which use   Hibernate.initialize(user);
        *   or used transaction on service level
        */
        UserEntity userEntity = roomOrderDao.getUserByOrderId(1);
        LOG.info("User in order id=1: " + userEntity);

        RoomEntity room=roomOrderDao.getRoomByOrderId(1);
        LOG.info("Room in order id=1: "+room);
    }


}
