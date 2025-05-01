package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zs.dto.ProductDto;
import com.zs.entity.Product;
import com.zs.service.ProductService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	// URL: http://localhost:8880/product/add
	@PostMapping(value = "/add", consumes = "application/json")
	public ResponseEntity<String> add(@RequestBody @Valid ProductDto p) {
		service.save(p);
		return new ResponseEntity<String>("Product added.", HttpStatus.OK);
	}

	// URL: http://localhost:8880/product/list
	@GetMapping(value = "/list", produces = "application/json")
	public ResponseEntity<List<Product>> list() {
		return new ResponseEntity<List<Product>>(service.list(), HttpStatus.OK);
	}
	
	// URL: http://localhost:8880/product/123
	@GetMapping(value = "/{code}")
	public ResponseEntity<Product> find(@PathVariable int code) {
		return new ResponseEntity<Product>(service.getByCode(code), HttpStatus.OK);
	}
	
	// URL: http://localhost:8880/product/123
	@DeleteMapping(value = "/{code}")
	public ResponseEntity<String> remove(@PathVariable int code) {
		service.delete(code);
		return new ResponseEntity<String>("Product deleted.", HttpStatus.OK);
	}
	
	// URL: http://localhost:8880/product/category/Mobile
	@GetMapping(value = "/category/{cat}", produces = "application/json")
	public ResponseEntity<List<Product>> byCategory(@PathVariable("cat") String category) {
		return new ResponseEntity<List<Product>>(service.listByCategory(category), HttpStatus.OK);
	}
	
	// URL: http://localhost:8880/product/price?min=1000&max=5000
	@GetMapping(value = "/price", produces = "application/json")
	public ResponseEntity<List<Product>> byPriceRange(@RequestParam double min, @RequestParam double max) {
		return new ResponseEntity<List<Product>>(service.listByPriceRange(min, max), HttpStatus.OK);
	}
	
	// URL: http://localhost:8880/product/low2high
	@GetMapping(value = "/low2high", produces = "application/json")
	public ResponseEntity<List<Product>> byPriceDesc() {
		return new ResponseEntity<List<Product>>(service.listByPriceLowToHigh(), HttpStatus.OK);
	}
}



