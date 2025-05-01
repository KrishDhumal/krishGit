package com.zs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("FROM Product WHERE price BETWEEN :min AND :max")
	List<Product> findByPriceRange(double min, double max);
	
	List<Product> findByCategory(String category);
	
	@Query("FROM Product ORDER BY price")
	List<Product> findByPriceDesc();
}
