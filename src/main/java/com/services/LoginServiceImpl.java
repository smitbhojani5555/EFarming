package com.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class LoginServiceImpl implements LoginService {

	private SessionFactory sessionFactory;

	public LoginServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Object[]> verifyUser(String userName, String password) {
		Session session = sessionFactory.getCurrentSession();
		String sqlQuery = "SELECT t.name,t.password FROM TblUser t WHERE t.name=:username AND t.password =:password";
		Query query = session.createQuery(sqlQuery);
		query.setParameter("username", userName);
		query.setParameter("password", password);
		
		List<Object[]> user = query.list();
		return user;
	}

	@Transactional
	public List<Object[]> listUser() {
		Session session = sessionFactory.getCurrentSession();
		String sqlQuery = "SELECT t.id,t.name FROM TblUser t";
		Query query = session.createQuery(sqlQuery);
		List<Object[]> user = query.list();
		return user;
	}
}

