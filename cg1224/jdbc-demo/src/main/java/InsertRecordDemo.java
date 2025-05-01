import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordDemo {

	public static void main(String[] args) {
		String sql = "insert into person values ('Sam',32,'Surat')";
		Connection conn = null;
		
		try {
			conn = JdbcUtil.getConnection();
			Statement stmt = conn.createStatement();
			int rows = stmt.executeUpdate(sql);
			System.out.println(rows + ", Record inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
