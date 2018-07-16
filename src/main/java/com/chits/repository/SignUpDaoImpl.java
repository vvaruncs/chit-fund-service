package com.chits.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chits.model.Customer;

@Repository
public class SignUpDaoImpl implements SignUpDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean signUpuser(Customer theCustomer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
		return true;
		
	}

}
