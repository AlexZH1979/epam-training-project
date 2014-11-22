package ru.yandex.zhmyd.hotel.service.test;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.yandex.zhmyd.hotel.model.Gender;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.model.UserRole;
import ru.yandex.zhmyd.hotel.service.UserService;

import java.util.List;
import java.util.logging.Logger;
//TODO review test code: add access methods for
public class UserServiceTest extends AbstractDaoTest{

    private static final Logger LOG = Logger.getLogger(UserServiceTest.class.getName());

    @Autowired
    private UserService userService;

    @Test
    public void saveUserTest(){

        User user=new User();
        user.setFirstName("ftest");
        user.setLastName("ltest");
        user.setLogin("test");
        user.setEmail("test@yandex.ru");
        user.setGender(Gender.MALE);
        user.setRole(UserRole.CUSTOMER);
        user.setPassword("test");


        LOG.info("SAVE USER: "+user);
        userService.save(user);


        User user1=new User();
        user1.setFirstName("ftest");
        user1.setLastName("ltest");
        user1.setLogin("test");
        user1.setEmail("test1@yandex.ru");
        user1.setRole(UserRole.CUSTOMER);
        user1.setPassword("test");

        try {
            LOG.info("TEST DOUBLE SAVE USER");
            userService.save(user1);
        }catch (RuntimeException e){
            LOG.info("FIND DOUBLE USER");
        }

        LOG.info("TEST delete");
        user=userService.getUserByCredits("test","test");
        LOG.info("FIND user="+user);
        userService.delete(user);
        LOG.info("DELETED");

        LOG.info("GET USERS FROM INTERVAL 5-15");
        List<User> users=userService.getInterval(5,10);
        LOG.warning(users.toString());
        LOG.warning("FIND: "+users.size());

    }
}
