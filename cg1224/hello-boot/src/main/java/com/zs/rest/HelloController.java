package com.zs.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/hello")	// http://127.0.0.1:8080/hello
	public String sayHello() {
		return "GET: Hello Spring Boot";
	}
	
	@PostMapping(value = "/hello")
	public String sayPostHello() {
		return "POST: Hello Spring Boot";
	}
	
	@PutMapping(value = "/hello")
	public String sayPutHello() {
		return "PUT: Hello Spring Boot";
	}
	
	@DeleteMapping(value = "/hello")
	public String sayDeleteHello() {
		return "DELETE: Hello Spring Boot";
	}
}
