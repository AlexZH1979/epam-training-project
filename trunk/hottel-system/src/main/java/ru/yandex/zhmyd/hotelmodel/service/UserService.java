package ru.yandex.zhmyd.hotelmodel.service;

import ru.yandex.zhmyd.hotelmodel.domain.User;

public interface UserService {
	
	User loadUserByCredentials(String login, String password);

	User getUserByID(Long userId);
}
