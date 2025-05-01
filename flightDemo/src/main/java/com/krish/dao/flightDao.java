package com.krish.dao;
import com.krish.pojo.*;
import java.util.*;
public interface flightDao {
	boolean save (flightPojo f);
	
	List<flightPojo> list();
	
	flightPojo findByCode(int code);
	List<flightPojo> findByCarrier(String carrier);
	List<flightPojo> findByRoute(String source,String dest);
	
}
