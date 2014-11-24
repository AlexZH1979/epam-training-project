package ru.yandex.zhmyd.hotel.service.mapper.converter;

import org.dozer.DozerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

public class UserEntityToLongConverter extends DozerConverter<UserEntity, Long> {
    /**
     * Defines two types, which will take part transformation.
     * As Dozer supports bi-directional mapping it is not known which of the classes is source and
     * which is destination. It will be decided in runtime.
     *
     * @param prototypeA type one
     * @param prototypeB type two
     */
    @Autowired
    private UserDao userDao;

    public UserEntityToLongConverter() {
        super(UserEntity.class, Long.class);
    }

    @Override
    public Long convertTo(UserEntity source, Long destination) {
        return source.getId();
    }

    @Override
    public UserEntity convertFrom(Long source, UserEntity destination) {
        return userDao.getById(source);
    }
}
