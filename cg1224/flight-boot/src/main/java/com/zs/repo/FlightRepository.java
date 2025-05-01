package com.zs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zs.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

	// select * from vimaan where carrier='carrier'
	List<Flight> findByCarrier(String carrier);
	
	// select * from vimaan where source='source' and destination='destination'
	List<Flight> findBySourceAndDestination(String source, String destination);
}
