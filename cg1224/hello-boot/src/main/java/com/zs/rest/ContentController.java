package com.zs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {

	// http://localhost:8080/text/Zubair
	@GetMapping(value = "/text/{naam}", produces = "text/plain")
	public String greetText(@PathVariable("naam") String name) {
		return "Welcome to Spring Boot, " + name;
	}

	// http://localhost:8080/html?naam=Zubair
	@GetMapping(value = "/html", produces = "text/html")
	public String greetHtml(@RequestParam("naam") String name) {
		return "<h1>Welcome to Spring Boot, " + name + "</h1>";
	}

	// http://localhost:8080/xml
	@GetMapping(value = "/xml", produces = "text/xml")
	public String greetXml() {
		return "<?xml version=\"1.0\"?><greeting>Welcome to Spring Boot</greeting>";
	}

	// http://localhost:8080/json
	@GetMapping(value = "/json", produces = "application/json")
	public String greetJson() {
		JSONPObject obj = new JSONPObject("greeting", "Welcome to Spring Boot");
		return obj.getValue().toString();
	}
	
}
