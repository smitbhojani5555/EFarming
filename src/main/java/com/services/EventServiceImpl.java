package com.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EventServiceImpl implements EventService {
	
	private SessionFactory sessionFactory;

	public EventServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Object[]> listevent() {
	
			
			Session session = sessionFactory.getCurrentSession();
			String sqlQuery = "SELECT t.eventid,t.subject,t.description,t.place FROM TblEvent t";
			Query query = session.createQuery(sqlQuery);
			List<Object[]> productList = query.list();
			return productList;
		
	}

	

}
