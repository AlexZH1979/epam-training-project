package ru.yandex.zhmyd.hotelmodel.repository.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ru.yandex.zhmyd.hotelmodel.repository.entity.base.MappedEnum;
import ru.yandex.zhmyd.hotelmodel.repository.entity.base.SystemDictionary;
import ru.yandex.zhmyd.hotelmodel.repository.enumerated.Gender;

@Entity
@Table(name = "gender")
@SequenceGenerator(name="entityIdGenerator", sequenceName="id")
@MappedEnum(enumClass=Gender.class)
public class GenderEntity extends SystemDictionary {

}
