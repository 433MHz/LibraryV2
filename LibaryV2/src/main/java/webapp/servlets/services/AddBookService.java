package webapp.servlets.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import webapp.servlets.services.JDBC.AddBookJDBC;

public class AddBookService {
	
	@Autowired
	AddBookJDBC addBookJDBC;
	
public String add(HttpServletRequest request) {
	String[] bookInfo = new String[6];
	
	for(int i = 0; i<=5; i++) {
		String parameter = "t"+(i+1);
		bookInfo[i] = request.getParameter(parameter);
	}
	
	return addBookJDBC.add(bookInfo);
}
}
