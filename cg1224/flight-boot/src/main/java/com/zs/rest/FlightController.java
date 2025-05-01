package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.zs.entity.Flight;
import com.zs.service.FlightService;
import com.zs.service.InvalidFlightException;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService service;
	
	// Post:http://localhost:8080/flight/add
	@PostMapping(value = "/add", consumes = "application/json")
	public String add(@RequestBody Flight f) {
		service.add(f);
		return "Flight added.";
	}
	
	// Get:http://localhost:8080/flight/get/101
	@GetMapping(value = "/get/{code}", produces = "application/json")
	public Flight get(@PathVariable int code) {
		try {
			return service.get(code);
		} catch (InvalidFlightException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
	// Get:http://localhost:8080/flight/list
	@GetMapping(value = "/list", produces = "application/json")
	public List<Flight> list() {
		return service.list();
	}
	
	// Get:http://localhost:8080/flight/carrier/Indigo
	@GetMapping(value = "/carrier/{carrier}", produces = "application/json")
	public List<Flight> getByCarrier(@PathVariable String carrier) {
		return service.listByCarrier(carrier);
	}
	
	// Get:http://localhost:8080/flight/route?source=Pune&destination=Goa
	@GetMapping(value="/route", produces = "application/json")
	public List<Flight> getByRoute(@RequestParam String source, @RequestParam String destination) {
		return service.listByRoute(source, destination);
	}
	
	// Put:http://localhost:8080/flight/update
	@PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
	public Flight update(@RequestBody Flight f) {
		return service.update(f);
	}
	
	// Delete:http://localhost:8080/flight/del?code=123
	@DeleteMapping(value = "/del")
	public String delete(@RequestParam int code) {
		service.delete(code);
		return "Flight deleted.";
	}
}

