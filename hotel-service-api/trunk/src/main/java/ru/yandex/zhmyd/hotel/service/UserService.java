package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.User;

public interface UserService extends BasicService<User, Long> {

    public User getUserByCredits(String login, String password);

    public void validateUser(User user);

}
