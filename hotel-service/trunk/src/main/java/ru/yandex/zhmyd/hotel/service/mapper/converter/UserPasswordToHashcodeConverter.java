package ru.yandex.zhmyd.hotel.service.mapper.converter;

import org.apache.log4j.Logger;
import org.dozer.DozerConverter;

public class UserPasswordToHashcodeConverter extends DozerConverter<Integer, String>{

    private static final Logger LOG = Logger.getLogger(UserPasswordToHashcodeConverter.class);

    /**
     * Defines two types, which will take part transformation.
     * As Dozer supports bi-directional mapping it is not known which of the classes is source and
     * which is destination. It will be decided in runtime.
     */
    public UserPasswordToHashcodeConverter() {
        super(Integer.class, String.class);
    }

    /**
     * STRONGLY ALWAYS RETURN NULL
     */
    @Override
    public String convertTo(Integer source, String destination) {
        return null;
    }

    /**
     * Converts the source field to the destination field and return the resulting destination
     * value
     *
     * @param source      the value of the source field
     * @param destination the current value of the desitinatino field (or null)
     * @return the resulting value for the destinatino field
     */
    @Override
    public Integer convertFrom(String source, Integer destination) {
        if(source==null) {
            LOG.warn("PASSWORD is null");
            return null;
        }
        return source.hashCode();
    }
}
