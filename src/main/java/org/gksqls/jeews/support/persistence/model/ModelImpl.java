package org.gksqls.jeews.support.persistence.model;

import java.util.List;

import javax.annotation.Resource;

import org.gksqls.jeews.support.common.exception.ModelException;
import org.mybatis.spring.SqlSessionTemplate;

public class ModelImpl<T> implements ModelInterface<T>{
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void insert(String id) throws ModelException {
		sqlSessionTemplate.insert(id);
	}

	public void insert(String id, T clasz) throws ModelException {
		sqlSessionTemplate.insert(id, clasz);
	}

	public <E> List<T> findAll(String id) throws ModelException {
		return sqlSessionTemplate.selectList(id);
	}

	public <E> List<T> findAll(String id, T clasz) throws ModelException {
		return sqlSessionTemplate.selectList(id, clasz);
	}
	
	public T find(String id) throws ModelException {
		return sqlSessionTemplate.selectOne(id);
	}

	public T find(String id, T clasz) throws ModelException {
		return sqlSessionTemplate.selectOne(id, clasz);
	}

	public void update(String id) throws ModelException {
		sqlSessionTemplate.update(id);
	}

	public void update(String id, T clasz) throws ModelException {
		sqlSessionTemplate.update(id, clasz);
	}

	public void delete(String id) throws ModelException {
		sqlSessionTemplate.delete(id);
	}

	public void delete(String id, T clasz) throws ModelException {
		sqlSessionTemplate.delete(id, clasz);
	}
	
}
