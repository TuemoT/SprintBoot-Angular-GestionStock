package com.gestion.stock.dao;

import antlr.collections.List;

public interface IGenericDao<E> {

	public E Save (E entity);
	
	public E update (E entity); 
	
	//public List<E> SelectALL;	
	
	public List SelectAll(String sortField,String Sort);
	
	public E getById (long id);
	
	public void remove (long id);
	
	public E findone (String paramName);
	
	public E findone (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	
	
	
	
	
	
}
