package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.Flight;
import com.zs.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository repo;

	@Override
	public void add(Flight f) {
		repo.save(f);
	}

	@Override
	public Flight get(int code) throws InvalidFlightException {
		return repo.findById(code).orElseThrow(() -> 
			new InvalidFlightException("Invalid flight code: " + code));
	}

	@Override
	public List<Flight> list() {
		return repo.findAll();
	}

	@Override
	public List<Flight> listByCarrier(String carrier) {
		return repo.findByCarrier(carrier);
	}

	@Override
	public List<Flight> listByRoute(String source, String destination) {
		return repo.findBySourceAndDestination(source, destination);
	}

	@Override
	public Flight update(Flight f) {
		repo.save(f);
		return f;
	}

	@Override
	public void delete(int code) {
		repo.deleteById(code);
	}
}
