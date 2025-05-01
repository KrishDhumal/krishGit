package com.capstone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.entity.Product;

/**
 * Database Repository of Product entity for MongoDB
 * @author Zubair Shaikh
 * @version 1.0
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategory(String category);
}
