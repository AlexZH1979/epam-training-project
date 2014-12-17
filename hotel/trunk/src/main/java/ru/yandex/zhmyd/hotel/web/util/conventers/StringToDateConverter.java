package ru.yandex.zhmyd.hotel.web.util.conventers;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        Long numDate=Long.valueOf(source);
        return new Date(numDate);
    }
}
