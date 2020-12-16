package webapp.servlets.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import webapp.servlets.services.JDBC.ShowBooksJDBC;

public class ShowBooksService {
	
	@Autowired
	ShowBooksJDBC showBooksJDBC;
		
	public ArrayList<String[]> getData() {
		 return showBooksJDBC.getData();
	}
}
