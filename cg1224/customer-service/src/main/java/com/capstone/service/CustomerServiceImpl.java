package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Customer;
import com.capstone.exception.CustomerNotFoundException;
import com.capstone.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer add(Customer c) {
		return repo.save(c);
	}

	@Override
	public Customer find(String custid) {
		return repo.findById(custid).orElseThrow(() -> new CustomerNotFoundException("Customer does not exist with ID: " + custid));
	}

	@Override
	public Customer authenticate(String custid, String password) {
		return repo.findByCustidAndPassword(custid, password).orElseThrow(
				() -> new CustomerNotFoundException("Invalid login credentials"));
	}

	@Override
	public List<Customer> list() {
		return repo.findAll();
	}

}
