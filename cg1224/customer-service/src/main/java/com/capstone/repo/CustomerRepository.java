package com.capstone.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	Optional<Customer> findByCustidAndPassword(String custid, String password);
}
