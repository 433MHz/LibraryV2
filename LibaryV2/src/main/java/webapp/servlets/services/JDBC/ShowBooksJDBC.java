package webapp.servlets.services.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import webapp.objects.BookObject;

public class ShowBooksJDBC {
	
	
	@Autowired
	ArrayList<String[]> arrayList;
	
	@Autowired
	JdbcConnectionData jdbcConnectionData;
	
	public ArrayList<String[]> getData() {
		
		try {
			Class.forName(jdbcConnectionData.JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(jdbcConnectionData.DB_URL, jdbcConnectionData.USERNAME, jdbcConnectionData.PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from books");
			
			while(resultSet.next()) {
				String[] data = new String[7];
				data[0]=(resultSet.getString("ID"));
				data[1]=(resultSet.getString("Title"));
				data[2]=(resultSet.getString("AuthorFirstName"));
				data[3]=(resultSet.getString("AuthorLastName"));
				data[4]=(resultSet.getString("YearOfPublish"));
				data[5]=(resultSet.getString("PublishingHouse"));
				data[6]=(resultSet.getString("Price"));
				
				arrayList.add(data);
			}
			return arrayList;
		} catch (Exception e) {
			return null;
		}
		
	}

}
