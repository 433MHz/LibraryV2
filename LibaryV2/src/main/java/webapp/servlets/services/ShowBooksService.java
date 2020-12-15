package webapp.servlets.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import webapp.objects.BookObject;
import webapp.servlets.services.JDBC.ShowBooksJDBC;

public class ShowBooksService {

	@Autowired
	BookObject bookObject;
	
	@Autowired
	ShowBooksJDBC showBooksJDBC;
	
	public ArrayList<BookObject> getData() {
		return showBooksJDBC.getData();
	}
}
