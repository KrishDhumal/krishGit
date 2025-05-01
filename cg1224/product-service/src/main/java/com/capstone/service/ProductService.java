package com.capstone.service;

import java.util.List;

import com.capstone.entity.Product;

public interface ProductService {

	Product add(Product p);
	
	Product find(int id);
	
	List<Product> list();
	
	List<Product> listByCategory(String category);
	
	void delete(int id);
}
