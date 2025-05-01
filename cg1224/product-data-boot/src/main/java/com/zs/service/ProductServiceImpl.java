package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.dto.ProductDto;
import com.zs.entity.Product;
import com.zs.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void save(ProductDto p) {
		Product prod = new Product();
		prod.setCode(p.getCode());
		prod.setName(p.getName());
		prod.setCategory(p.getCategory());
		prod.setPrice(p.getPrice());
		repo.save(prod);
	}

	@Override
	public List<Product> list() {
		return repo.findAll();
	}

	@Override
	public Product getByCode(int code) throws InvalidProductException {
		return repo.findById(code).orElseThrow(() -> 
				new InvalidProductException("Product not found with code: " + code));
	}

	@Override
	public void delete(int code) {
		repo.deleteById(code);
	}

	@Override
	public List<Product> listByCategory(String cat) {
		return repo.findByCategory(cat);
	}

	@Override
	public List<Product> listByPriceRange(double min, double max) {
		return repo.findByPriceRange(min, max);
	}

	@Override
	public List<Product> listByPriceLowToHigh() {
		return repo.findByPriceDesc();
	}
}
