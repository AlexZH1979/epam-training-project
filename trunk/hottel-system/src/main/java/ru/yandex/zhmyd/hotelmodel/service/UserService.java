package ru.yandex.zhmyd.hotelmodel.service;

import java.util.List;

import ru.yandex.zhmyd.hotelmodel.domain.User;

public interface UserService {
	
	User loadUserByCredentials(String login, String password);

	User getUserByID(Long userId);
	
	List<User> getUsers();
}
