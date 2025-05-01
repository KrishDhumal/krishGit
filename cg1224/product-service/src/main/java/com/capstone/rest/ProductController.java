package com.capstone.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Product;
import com.capstone.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/add")
	public Product add(@RequestBody Product p) {
		return service.add(p);
	}
	
	@GetMapping(value = "/{id}")
	public Product find(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/all")
	public List<Product> list() {
		return service.list();
	}
	
	@GetMapping(value = "/category/{cat}")
	public List<Product> listByCategory(@PathVariable String cat) {
		return service.listByCategory(cat);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}
