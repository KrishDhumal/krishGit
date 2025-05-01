package com.zs.service;

import java.util.List;

import com.zs.dto.ProductDto;
import com.zs.entity.Product;

public interface ProductService {

	void save(ProductDto p);
	
	List<Product> list();
	
	Product getByCode(int code) throws InvalidProductException;
	
	void delete(int code);
	
	List<Product> listByCategory(String cat);
	
	List<Product> listByPriceRange(double min, double max);
	
	List<Product> listByPriceLowToHigh();
}
