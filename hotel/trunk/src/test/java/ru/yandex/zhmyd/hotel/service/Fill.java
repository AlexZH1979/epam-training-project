package ru.yandex.zhmyd.hotel.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class Fill extends AbstractDaoTest {
    @Autowired
    private RoomService roomService;

    @Ignore
    @Test
    public void test(){
        roomService.save(null);
    }


}
