package hotelmodel.service;

import hotelmodel.domain.User;

import java.util.List;

public interface UserService {

	void saveUser(User user);

	void deleteUser(User user);

	User getUserById(int id);

	List<User> getUsers();

	void updeteUser(User user);
}
