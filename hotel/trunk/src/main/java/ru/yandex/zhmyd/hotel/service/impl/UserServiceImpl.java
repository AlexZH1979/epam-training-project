package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;
import ru.yandex.zhmyd.hotel.security.ApplicationUserDetails;
import ru.yandex.zhmyd.hotel.service.UserService;
import ru.yandex.zhmyd.hotel.service.exceptions.ServiceException;

/*
* @Transactional
* interface UserService
 */
@Service
@SuppressWarnings("unused")
public class UserServiceImpl extends AbstractServiceImpl<User, UserEntity, UserDao, Integer> implements UserService {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByCredits(String login, String password) {

        LOG.debug("GET to getUser login=" + login + ", password=" + password);
        UserEntity userEntity = userDao.getByCredentials(login, password);
        User user = null;
        if (userEntity != null) {
            LOG.debug("FIND: " + userEntity);
            user = mapper.map(userEntity, User.class);
        } else {
            LOG.warn("NO FOUND USER BY CREDENTIALS: login=" + login + ", password=" + password);
        }
        LOG.debug("SEND from ru.yandex.zhmyd.hotel.ru.yandex.zhmyd.hotel.service getUser: " + user);
        return user;
    }

    @Override
    public User getUserByPrincipal(ApplicationUserDetails details) {
        return mapper.map(details.getAccount(),User.class);
    }

    @Override
    public void save(User user) {
        UserEntity userEntity=mapper.map(user, UserEntity.class);
        Criterion cr= Restrictions.or(Restrictions.eq("login", userEntity.getLogin()),
                Restrictions.eq("email",userEntity.getEmail()));
        /*
         *   verify before saved, if user which this criteria already exist throws exception
         */
        if(!userDao.getByCriteria(cr).isEmpty()) {
            throw new ServiceException("user  already exist");
        }
        super.save(user);
    }
}
