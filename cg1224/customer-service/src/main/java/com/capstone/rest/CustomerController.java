package com.capstone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Customer;
import com.capstone.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping(value = "/add")
	public Customer add(@RequestBody Customer c) {
		return service.add(c);
	}
	
	@GetMapping(value = "/{custid}")
	public Customer find(@PathVariable String custid) {
		return service.find(custid);
	}
	
	@GetMapping("/login")
	public Customer authenticate(@RequestParam String custid, @RequestParam String password) {
		return service.authenticate(custid, password);
	}
	
	@GetMapping("/all")
	public List<Customer> list() {
		return service.list();
	}
}
