package ru.yandex.zhmyd.hotel.repository.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ru.yandex.zhmyd.hotel.repository.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.hotel.repository.dao.UserDao;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

@Repository
@SuppressWarnings("unused")
public class UserDaoImpl extends AbstractHibernateDao<UserEntity, Long> implements UserDao {

    @Override
    public UserEntity getByCredentials(final String login, final Integer passwordHasCode) {
        Criteria cr = getSession().createCriteria(UserEntity.class, "users")
                .add(Restrictions.eq("login", login))
                .add(Restrictions.eq("passwordHashCode", passwordHasCode));

        return (UserEntity) cr.uniqueResult();
    }

    @Override
    public UserEntity getById(final Long id) {
        return (UserEntity)  getSession().get(UserEntity.class, id);
    }
}
