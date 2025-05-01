import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		Connection conn = null;

		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url, "zubair", "oracle");
			System.out.println("Connected successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
