package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Product;
import com.capstone.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	@Override
	public Product add(Product p) {
		return repo.save(p);
	}

	@Override
	public Product find(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Product> list() {
		return repo.findAll();
	}

	@Override
	public List<Product> listByCategory(String category) {
		return repo.findByCategory(category);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
