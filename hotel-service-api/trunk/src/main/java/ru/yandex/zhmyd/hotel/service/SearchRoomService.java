package ru.yandex.zhmyd.hotel.service;


import ru.yandex.zhmyd.hotel.model.Room;

import java.util.HashMap;
import java.util.List;

public interface SearchRoomService {

    //TO-DO replace HashMap to Room ????
    public List<Room> searchByParameters(HashMap<String, Object> param);
}
