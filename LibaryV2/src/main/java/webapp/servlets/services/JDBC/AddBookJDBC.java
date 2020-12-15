package webapp.servlets.services.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;

public class AddBookJDBC {

	@Autowired
	JdbcConnectionData jdbcConnectionData;

public synchronized String add(String[] bookInfo) {
		try {
			Class.forName(jdbcConnectionData.JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(jdbcConnectionData.DB_URL, jdbcConnectionData.USERNAME, jdbcConnectionData.PASSWORD);
			PreparedStatement statement = connection.prepareStatement("insert into books values (null, ?, ?, ?, ?, ?, ?)");
			for(int i = 0; i<=5; i++) {
				statement.setString(i+1, bookInfo[i]);
			}
			statement.executeUpdate();
			statement.close();
			connection.close();
			return "Data added";
		} catch (Exception e) {
			return "Error while adding data";
		}
		
}
}
