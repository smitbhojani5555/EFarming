package com.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class ImageServiceImpl implements ImageService {

	private SessionFactory sessionFactory;

	public ImageServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Object> listimage(String productname) {
		Session session = sessionFactory.getCurrentSession();
		String sqlQuery = "SELECT t.productimage FROM TblProduct t WHERE t.productname= :productname";
		Query query = session.createQuery(sqlQuery);
		query.setParameter("productname", productname);
		List<Object> productList = query.list();

		return productList;

	}
}
