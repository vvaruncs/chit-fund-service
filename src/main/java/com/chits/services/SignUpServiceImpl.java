package com.chits.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chits.model.Customer;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Override
	@Transactional
	public boolean signUpuser(Customer theCustomer) {
		return false;
	}
    
	
}
