package com.services;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.table.TblUser;
@Repository
public class FileUploadServiceImpl implements FileUploadService {

	private SessionFactory sessionFactory;
	public FileUploadServiceImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}
	 @Transactional
	public void save(TblUser uploadFile) {
		
		 sessionFactory.getCurrentSession().save(uploadFile);
	    }
	}


