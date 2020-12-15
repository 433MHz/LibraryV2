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
	BookObject bookObject;
	
	@Autowired
	ArrayList<BookObject> arrayList;
	
	@Autowired
	JdbcConnectionData jdbcConnectionData;
	
	public ArrayList<BookObject> getData() {
		
		try {
			Class.forName(jdbcConnectionData.JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(jdbcConnectionData.DB_URL, jdbcConnectionData.USERNAME, jdbcConnectionData.PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from books");
			
			while(resultSet.next()) {
				bookObject.setId(resultSet.getInt("ID"));
				bookObject.setTitle(resultSet.getString("Title"));
				bookObject.setAuthorFirstName(resultSet.getString("AuthorFirstName"));
				bookObject.setAuthorLastName(resultSet.getString("AuthorLastName"));
				bookObject.setYearOfPublish(resultSet.getInt("YearOfPublish"));
				bookObject.setPublishingHouse(resultSet.getString("PublishingHouse"));
				bookObject.setPrice(resultSet.getFloat("Price"));
				
				arrayList.add(bookObject);
				bookObject = new BookObject();
			}
			return arrayList;
		} catch (Exception e) {
			return null;
		}
		
	}

}
