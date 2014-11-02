package ru.yandex.zhmyd.hotelmodel.repository.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ru.yandex.zhmyd.hotelmodel.repository.entity.base.MappedEnum;
import ru.yandex.zhmyd.hotelmodel.repository.entity.base.SystemDictionary;
import ru.yandex.zhmyd.hotelmodel.repository.enumerated.RoomCategory;

@Entity
@Table(name = "room_category")
@SequenceGenerator(name = "entityIdGenerator", sequenceName = "id")
@MappedEnum(enumClass = RoomCategory.class)
public class RoomCategoryEntity extends SystemDictionary {

}
