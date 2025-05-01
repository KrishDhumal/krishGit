package com.krish.dao;
import java.sql.*;
import java.util.*;
import com.krish.pojo.flightPojo;
import org.postgresql.Driver;
public class flightDaoImpl implements flightDao {
	private Connection getConnection() throws SQLException	{
		String url = "jdbc:postgresql://localhost:5432/FlightDemo";
		 DriverManager.registerDriver(new Driver());
		 return DriverManager.getConnection(url,"postgres","krish1209");
	}

	public boolean save(flightPojo f) {
		String sql = "insert into flight values(?,?,?,?)";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,f.getCode());
			stmt.setString(2,f.getCarrier());
			stmt.setString(3,f.getSource());
			stmt.setString(4,f.getDest());
			if(stmt.executeUpdate()>0)
			{
				return true;
			}
			else 
			{
				return false ;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<flightPojo> list() {
	    String sql = "select * from flight";
	    List<flightPojo> flights = new ArrayList<>();
	    try (Connection con = getConnection(); 
	         Statement stmt = con.createStatement(); 
	         ResultSet rs = stmt.executeQuery(sql)) {
	        
	        while (rs.next()) {
	            flightPojo f = new flightPojo();
	            f.setCode(rs.getInt(1));
	            f.setCarrier(rs.getString(2));
	            f.setSource(rs.getString(3));
	            f.setDest(rs.getString(4));
	            flights.add(f);
	        }
	        return flights;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}


	public flightPojo findByCode(int code) {
		
		String sql = "select * from flight where code="+code;
		Connection con = null;
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			flightPojo f = null;
			while(rs.next())
			{
				f = new flightPojo();
				f.setCode(rs.getInt(1));
				f.setCarrier(rs.getString(2));
				f.setSource(rs.getString(3));
				f.setDest(rs.getString(4));
				
			}
			return f;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}



	public List<flightPojo> findByCarrier(String carrier) {
		String sql = "select * from flight where carrier=?";
		Connection conn = null;
		List<flightPojo> flights = new ArrayList<flightPojo>();
		
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, carrier);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				flightPojo f = new flightPojo();
				f.setCode(rs.getInt(1));
				f.setCarrier(rs.getString(2));
				f.setSource(rs.getString("source"));
				f.setDest(rs.getString(4));
				
				flights.add(f);
			}
			return flights;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<flightPojo> findByRoute(String source, String dest) {
		String sql = "select * from flight where source=? and destination=?";
		Connection conn = null;
		List<flightPojo> flights = new ArrayList<flightPojo>();
		
		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, source);
			stmt.setString(2, dest);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				flightPojo f = new flightPojo();
				f.setCode(rs.getInt(1));
				f.setCarrier(rs.getString(2));
				f.setSource(rs.getString("source"));
				f.setDest(rs.getString(4));
				
				flights.add(f);
			}
			return flights;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}