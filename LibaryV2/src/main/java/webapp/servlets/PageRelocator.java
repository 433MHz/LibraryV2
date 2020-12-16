package webapp.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageRelocator {

	@RequestMapping("/relocate")
	public String relocate(HttpServletRequest request, HttpServletResponse response) {
		String addBook = request.getParameter("b1");
		String showBooks = request.getParameter("b2");
		try {
			if (addBook != null) {
				return("addBook");
			} else if (showBooks != null) {
				response.sendRedirect("showBooks");
				return null;
			} else {
				response.sendRedirect("index");
				return null;
			}
		} catch (Exception e) {
			try {
				response.sendRedirect("index");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return null;
		}
	}
}
