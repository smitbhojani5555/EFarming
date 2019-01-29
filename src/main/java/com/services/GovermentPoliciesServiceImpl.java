package com.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class GovermentPoliciesServiceImpl implements GovermentPoliciesService {

	private SessionFactory sessionFactory;

	public GovermentPoliciesServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Object[]> listpolicies() {
		Session session = sessionFactory.getCurrentSession();
		String sqlQuery = "SELECT t.policyid,t.description,t.title FROM TblGovermentPolicies t";
		Query query = session.createQuery(sqlQuery);
		List<Object[]> product = query.list();
		return product;
	}

}
