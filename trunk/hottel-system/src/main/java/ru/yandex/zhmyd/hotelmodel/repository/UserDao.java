package ru.yandex.zhmyd.hotelmodel.repository;

import ru.yandex.zhmyd.hotelmodel.repository.base.GenericDao;
import ru.yandex.zhmyd.hotelmodel.repository.entity.UserEntity;

public interface UserDao extends GenericDao<UserEntity, Long> {
	
	UserEntity findByCredentials(String login, Integer passwordHasCode);

}
