package ru.yandex.zhmyd.hotel.service.mapper.converter;

import org.dozer.DozerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.repository.dao.RoomDao;
import ru.yandex.zhmyd.hotel.repository.entity.RoomEntity;

public class RoomEntityToIntegerConverter extends DozerConverter<RoomEntity, Integer> {

    @Autowired
    private RoomDao roomDao;

    public RoomEntityToIntegerConverter() {
        super(RoomEntity.class, Integer.class);
    }

    @Override
    public Integer convertTo(RoomEntity source, Integer destination) {
        return source.getId();
    }

    @Override
    public RoomEntity convertFrom(Integer source, RoomEntity destination) {
        return roomDao.getById(source);
    }
}
