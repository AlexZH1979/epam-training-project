package ru.yandex.zhmyd.hotel.web.conventers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.yandex.zhmyd.hotel.model.Hotel;
import ru.yandex.zhmyd.hotel.service.HotelService;

@Component
public class StringToHotelConverter implements Converter<String, Hotel>{

    @Autowired
    private HotelService hotelService;

    @Override
    public Hotel convert(String source) {
        return hotelService.getById(Integer.parseInt(source));
    }
}
