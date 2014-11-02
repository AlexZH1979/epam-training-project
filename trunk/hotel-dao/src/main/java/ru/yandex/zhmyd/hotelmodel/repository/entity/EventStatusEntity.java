package ru.yandex.zhmyd.hotelmodel.repository.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ru.yandex.zhmyd.hotelmodel.repository.entity.base.MappedEnum;
import ru.yandex.zhmyd.hotelmodel.repository.entity.base.SystemDictionary;
import ru.yandex.zhmyd.hotelmodel.repository.enumerated.EventStatus;

@Entity
@Table(name = "event_status")
@SequenceGenerator(name = "entityIdGenerator", sequenceName = "id")
@MappedEnum(enumClass = EventStatus.class)
public class EventStatusEntity extends SystemDictionary {

}
