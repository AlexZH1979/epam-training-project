package ru.yandex.zhmyd.hotel.repository.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {
	
	PK save(final T obj);
	
	void update(final T obj);
	
	List<T> findAll();

    List<T> findByCriteriaSubsequence(Criterion criterion, int begin, int count);
	
	List<T> findByCriteria(Criterion criterion);
	
	T findById(final PK id);
	
	void delete(final PK id);
	
	void delete(final T persistentObject);
}
