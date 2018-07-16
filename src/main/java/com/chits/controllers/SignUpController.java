package com.chits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chits.model.Customer;
import com.chits.services.SignUpServiceImpl;

@RestController
@RequestMapping("/signup")
public class SignUpController {
	
	@Autowired
	SignUpServiceImpl signUpServiceImpl;
	
	@PostMapping("/")
	public boolean signUpUser(@RequestBody Customer theCustomer) {
		return signUpServiceImpl.signUpuser(theCustomer);
	}

}
