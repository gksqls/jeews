package org.gksqls.jeews.support.persistence.model;

import java.util.List;

import org.gksqls.jeews.support.common.exception.ModelException;

public interface ModelInterface <T> {
	
	public void insert(String id) throws ModelException;
	public void insert(String id, T clasz) throws ModelException;
	
	public <E> List<T> findAll(String id) throws ModelException;
	public <E> List<T> findAll(String id, T clasz) throws ModelException;
	
	public T find(String id) throws ModelException;
	public T find(String id, T clasz) throws ModelException;
	
	public void update(String id) throws ModelException;
	public void update(String id, T clasz) throws ModelException;
	
	public void delete(String id) throws ModelException;
	public void delete(String id, T clasz) throws ModelException;
	
}
