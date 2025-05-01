package com.krish.service;

import java.util.*;

import com.krish.pojo.*;
public interface flightService {
	boolean save ( flightPojo f) ; 
	public List<flightPojo>list();
	public flightPojo findByCode(int code) ;
	public List<flightPojo> findByCarrier(String carrier);
	public List<flightPojo> findByRoute(String source, String dest);
	
	

}
