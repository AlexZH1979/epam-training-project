package ru.yandex.zhmyd.hotel.web.conventers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.yandex.zhmyd.hotel.model.User;
import ru.yandex.zhmyd.hotel.service.UserService;

@Component
public class StringToUserConverter implements Converter<String, User>{

    @Autowired
    private UserService userService;

    @Override
    public User convert(String source) {
        return userService.getById(Integer.parseInt(source));
    }
}
