package tetris;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
	
	static Connection connection = null;
	static Statement stmt = null;
	static Statement stmt1 = null;
	static Statement stmt2 = null;
	static String jdbcURL = "jdbc:mariadb://10.10.240.125:3307/Tetris";
	static String username = "Tetris";
	static String password = "dfalkJE346sda!";

	public static void ConnectionDatabase() throws Exception {
		try {
			connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Successfully connected to database");
		} catch (Exception e) {
			System.out.println("Connection to the Database failed");
			System.out.println(e);
		}
	}
	
	public sttaattiicc 
	
	
}
