package com.zs.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.zs.dao.CustomerDao;
import com.zs.entity.Customer;

public class TestCustomerDao {
	private static CustomerDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new CustomerDao();
	}
	
	@Test
	public void testAdd() {
		Customer c = new Customer(104, "Pablo", 250);
		assertTrue(dao.add(c));
	}
	
	@Test
	public void testGet() {
		Customer c = dao.get(102);
		assertNotNull(c);
		System.out.println(c);
	}
	
	@Test
	public void testAll() {
		List<Customer> customers = dao.all();
		assertFalse(customers.isEmpty());
		for(Customer c : customers)
			System.out.println(c);
	}
	
	@Test
	public void testDel() {
		assertTrue(dao.del(103));
	}
}
