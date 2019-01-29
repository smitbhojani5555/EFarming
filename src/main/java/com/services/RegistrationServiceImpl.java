package com.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.table.TblUser;

public class RegistrationServiceImpl implements RegistrationService{

	private SessionFactory sessionFactory;
	public RegistrationServiceImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}	
		@Transactional
		public String addUser(String firstname,String lastname,String name,String email,String mobileno,String password1,int usertype ) {
			Session session = sessionFactory.getCurrentSession();
			TblUser tbl = new TblUser();
			tbl.setFirstname(firstname);
			tbl.setLastname(lastname);
			tbl.setName(name);
			tbl.setEmail(email);
			tbl.setMobileno(mobileno);
			tbl.setPassword(password1);
			tbl.setUsertype(usertype);
			session.save(tbl);
			return "success";
		}
		
	}


