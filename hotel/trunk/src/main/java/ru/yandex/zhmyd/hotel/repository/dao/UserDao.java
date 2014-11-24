package ru.yandex.zhmyd.hotel.repository.dao;


import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

public interface UserDao extends GenericDao<UserEntity, Long>{
	
	UserEntity getByCredentials(final String login, final Integer passwordHasCode);

}
