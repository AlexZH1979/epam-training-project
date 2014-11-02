package ru.yandex.zhmyd.hotelmodel.repository.entity.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("rawtypes")
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MappedEnum {
	Class<? extends Enum> enumClass();
}
