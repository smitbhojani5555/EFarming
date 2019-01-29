package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductServiceImpl implements ProductService {
	
	private SessionFactory sessionFactory;

	public ProductServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Object[]> listproduct() {
	
			
			Session session = sessionFactory.getCurrentSession();
			String sqlQuery = "SELECT t.productid,t.productname,t.description,t.price,t.productimage FROM TblProduct t";
			Query query = session.createQuery(sqlQuery);
			
			List<Object[]> product = query.list();
			return product;
		
	}
	
	

}
