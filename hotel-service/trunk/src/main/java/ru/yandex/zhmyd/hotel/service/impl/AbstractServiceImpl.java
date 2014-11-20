package ru.yandex.zhmyd.hotel.service.impl;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.zhmyd.hotel.repository.dao.GenericDao;
import ru.yandex.zhmyd.hotel.service.BasicService;
import ru.yandex.zhmyd.hotel.service.mapper.util.Util;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * T -target DTO type
 * E- entity type
 * DAO - DaoImpl class
 * ID - primary key value (id)
 */
@Transactional
public abstract class AbstractServiceImpl<T, E, DAO extends GenericDao, ID extends Serializable> implements BasicService<T, ID> {

    private static final Logger LOG = Logger.getLogger(AbstractServiceImpl.class);

    @Autowired
    protected DAO dao;


    @Autowired
    protected Mapper mapper;

    @Override
    public T getById(ID id) {
        LOG.debug("GET to getById id=" + id);
        E entity = (E) dao.findById(id);
        LOG.debug("FIND entity=" + entity);
        T dto = mapper.map(entity, this.getGenericTargetClass());
        LOG.debug("RETURN from service getById dto=" + dto);
        return dto;
    }

    public List<T> getAll() {
        LOG.debug("GET to getAll");
        return (List<T>) Util.map(mapper, dao.findAll(), this.getGenericTargetClass());
    }

    @Override
    public List<T> getInterval(Integer begin, Integer count) {
        LOG.debug("GET to getInterval values: begin=" + begin + ", count=" + count);
        return (List<T>) Util.map(mapper, dao.findByCriteriaSubsequence(null, begin, count), this.getGenericTargetClass());
    }

    @Override
    public void save(T dto) {
        LOG.debug("GET to save dto=" + dto);
        E entity = mapper.map(dto, this.getGenericEntityClass());
        LOG.debug("MAPPED entity=" + entity);
        dao.save(entity);
        LOG.debug("SAVED entity to db");

    }

    @Override
    public void delete(T t) {
        LOG.info("GET to delete dto=" + t);
        E entity = mapper.map(t, this.getGenericEntityClass());
        LOG.info("FIND entity="+entity);
        dao.delete(entity);
    }

    @Override
    public void delete(ID id) {
        LOG.debug("GET to delete id=" + id);
        dao.delete(id);
    }

    private Class<T> getGenericTargetClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    private Class<E> getGenericEntityClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        return (Class<E>) parameterizedType.getActualTypeArguments()[1];
    }
}
