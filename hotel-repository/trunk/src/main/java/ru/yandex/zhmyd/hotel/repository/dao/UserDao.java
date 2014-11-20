package ru.yandex.zhmyd.hotel.repository.dao;


import ru.yandex.zhmyd.hotel.repository.entity.RoomOrderEntity;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

import java.util.List;

public interface UserDao extends GenericDao<UserEntity, Long>{
	
	UserEntity findByCredentials(final String login, final Integer passwordHasCode);

}
