package com.krish.service;

import java.util.List;
import com.krish.pojo.flightPojo;
import com.krish.dao.flightDao;
import com.krish.dao.flightDaoImpl;

public class flightServiceImpl implements flightService {

    private flightDao dao = new flightDaoImpl();

    
    public boolean save(flightPojo f) {
        if (f.getCarrier() == null || f.getCarrier().isEmpty()) {
            throw new InvalidException("Carrier name cannot be null or empty.");
        }
        return dao.save(f); 
    }

    
    public List<flightPojo> list() {
        return dao.list(); 
    }

    public flightPojo findByCode(int code) {
        return dao.findByCode(code);
    }

    public List<flightPojo> findByCarrier(String carrier) {
        return dao.findByCarrier(carrier);
    }

    
    public List<flightPojo> findByRoute(String source, String dest) {
        return dao.findByRoute(source, dest);
    }
}
