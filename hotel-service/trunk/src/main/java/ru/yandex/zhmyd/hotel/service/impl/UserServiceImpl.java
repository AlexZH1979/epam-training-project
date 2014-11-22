package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;
import ru.yandex.zhmyd.hotel.service.UserService;
/*
* @Transactional
* interface UserService
 */
@Service
@SuppressWarnings("unused")
public class UserServiceImpl extends AbstractServiceImpl<User, UserEntity, UserDao, Long> implements UserService {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByCredits(String login, String password) {

        LOG.debug("GET to getUser login=" + login + ", password=" + password);
        UserEntity userEntity = userDao.getByCredentials(login, password.hashCode());
        User user = null;
        if (userEntity != null) {
            LOG.debug("FIND: " + userEntity);
            user = mapper.map(userEntity, User.class);
        } else {
            LOG.warn("NO FOUND USER BY CREDENTIALS: login=" + login + ", password=" + password);
        }
        LOG.debug("SEND from service getUser: " + user);
        return user;
    }

    @Override
    public void save(User user) {
        UserEntity userEntity=mapper.map(user, UserEntity.class);
        Criterion cr= Restrictions.or(Restrictions.eq("login", userEntity.getLogin()),
                Restrictions.eq("email",userEntity.getEmail()));
        //TODO
        //verify before saved, if user which this criteria already exist throws exception
        if(!userDao.getByCriteria(cr).isEmpty()) {
            throw new RuntimeException();
        }
        super.save(user);
    }
}
