package ru.yandex.zhmyd.hotel.service;

import ru.yandex.zhmyd.hotel.model.User;

import javax.transaction.Transactional;

@Transactional
public interface UserService extends BasicService<User, Long> {

    public User getUserByCredits(String login, String password);

}
