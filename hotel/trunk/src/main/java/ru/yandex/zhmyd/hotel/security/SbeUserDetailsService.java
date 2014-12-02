package ru.yandex.zhmyd.hotel.security;


import org.hibernate.criterion.Restrictions;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.yandex.zhmyd.hotel.repository.dao.impl.UserDaoImpl;
import ru.yandex.zhmyd.hotel.repository.entity.UserEntity;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service("userService")
@Transactional
public class SbeUserDetailsService implements UserDetailsService {

    @Resource
    private UserDaoImpl userDao;

    /**
     * Locates the user based on the username. In the actual implementation, the search may possibly be case
     * sensitive, or case insensitive depending on how the implementation instance is configured. In this case, the
     * <code>UserDetails</code> object that comes back may have a username that is of a different case than what was
     * actually requested..
     *
     * @param login the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws org.springframework.security.core.userdetails.UsernameNotFoundException if the user could not be found or the user has no GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UserEntity userEntity = userDao.getByCriteria(Restrictions.eq("login", login)).get(0);

        if ((userEntity == null)) {
            throw new UsernameNotFoundException("login is not found");
        }
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority("ROLE_"+userEntity.getRole().name()));
        System.out.println(new SimpleGrantedAuthority("ROLE_"+userEntity.getRole().name()));
        System.out.println(userEntity.getRole().name());
        ApplicationUserDetails userDetails = new ApplicationUserDetails(userEntity, roles);
        return userDetails;
    }
}
