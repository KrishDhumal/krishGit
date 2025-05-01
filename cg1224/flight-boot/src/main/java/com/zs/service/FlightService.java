package com.zs.service;

import java.util.List;

import com.zs.entity.Flight;

public interface FlightService {

	void add(Flight f);
	
	Flight get(int code) throws InvalidFlightException;
	
	List<Flight> list();
	
	List<Flight> listByCarrier(String carrier);
	
	List<Flight> listByRoute(String source, String destination);
	
	Flight update(Flight f);
	
	void delete(int code);
}
