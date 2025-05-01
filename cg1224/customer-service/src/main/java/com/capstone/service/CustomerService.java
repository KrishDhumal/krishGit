package com.capstone.service;

import java.util.List;

import com.capstone.entity.Customer;

public interface CustomerService {

	Customer add(Customer c);
	
	Customer find(String custid);
	
	Customer authenticate(String custid, String password);
	
	List<Customer> list();
}
