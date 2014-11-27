package ru.yandex.zhmyd.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.model.Room;
import ru.yandex.zhmyd.hotel.repository.dao.HotelDao;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.HotelEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomCategoryEntity;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;
import ru.yandex.zhmyd.hotel.service.impl.AbstractServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Service
@Transactional
public class FilRoomDB extends AbstractServiceImpl<Room, RoomEntity, RoomDao, Integer> implements RoomService {
    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private RoomDao roomDao;

    @Override
    public void save(Room dto) {
        Long length = hotelDao.getLength();
        for (long l = 50000; l < 51000; l++) {
            Random random = new Random(System.currentTimeMillis());
            int count = random.nextInt(15) + 5;
            List<RoomEntity> rooms = new ArrayList<>();
            HotelEntity hotelEntity = hotelDao.getById((int) l);

            for (int i = 0; i < count; i++) {
                RoomEntity room = new RoomEntity();
                room.setCategory(Arrays.asList(RoomCategoryEntity.values()).get(random.nextInt(3)));
                room.setDescription("descriptions -----" + i);
                room.setPrice(random.nextInt(1000) + 100);
                room.setRoomName("name: " + i);
                room.setSize((byte) (random.nextInt(5)+1));
                room.setHotel(hotelEntity);
                roomDao.save(room);
                rooms.add(room);
            }
            hotelEntity.setRooms(rooms);
           /* hotelDao.update(hotelEntity);*/
            System.out.println(hotelEntity);
        }
        //super.save(dto);
    }

    @Override
    public List<Room> getRoomsByHotel(Hotel hotel) {
        //TODO
        return null;
    }

    @Override
    public List<Room> getRoomsByHotel(Integer integer) {
        //TODO
        return null;
    }
}