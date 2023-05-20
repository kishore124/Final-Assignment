package in.ineuron.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	private JdbcUtil() {
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql:///kishore";
		String user = "root";
		String password = "24111999";
		Connection connnection = DriverManager.getConnection(url, user, password);
		return connnection;
	}

}
