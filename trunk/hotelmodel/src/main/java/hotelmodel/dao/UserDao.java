package hotelmodel.dao;

import hotelmodel.domain.User;

import java.util.List;

public interface UserDao {

	void saveUser(User user);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getUsers();

	void updateUser(User user);
}