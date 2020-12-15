package webapp.servlets.services.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddBookJDBC {
String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
String DB_URL = "jdbc:mysql://localhost/library";
String USERNAME = "root";
String PASSWORD = "";

public synchronized void add(String[] bookInfo) {
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement statement = connection.prepareStatement("insert into books values (null, ?, ?, ?, ?, ?, ?)");
			for(int i = 0; i<=5; i++) {
				statement.setString(i+1, bookInfo[i]);
			}
			statement.executeUpdate();
			statement.close();
			connection.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
