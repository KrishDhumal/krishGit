package com.zs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.zs.entity.Customer;

public class CustomerDao {
	private EntityManagerFactory factory;

	public CustomerDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public boolean add(Customer c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		em.persist(c);
		txn.commit();

		return true;
	}

	public Customer get(int custId) {
		EntityManager em = factory.createEntityManager();
		Customer c = em.find(Customer.class, custId);
		return c;
	}

	public List<Customer> all() {
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("FROM Customer");
		return query.getResultList();
	}

	public boolean del(int custId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		Customer c = em.find(Customer.class, custId);
		em.remove(c);
		txn.commit();
		
		return true;
	}
}

