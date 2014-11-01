package ru.yandex.zhmyd.hotelmodel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.yandex.zhmyd.hotelmodel.domain.User;
import ru.yandex.zhmyd.hotelmodel.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	public User loadUserByCredentials(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByID(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
