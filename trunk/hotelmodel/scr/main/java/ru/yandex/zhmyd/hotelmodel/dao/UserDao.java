package ru.yandex.zhmyd.hotelmodel.dao;

import java.util.List;

import ru.yandex.zhmyd.hotelmodel.domain.User;

public interface UserDao {

	void saveUser(User user);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getUsers();

	void updateUser(User user);
}