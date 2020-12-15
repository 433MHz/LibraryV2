package webapp.servlets;

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
				return "addBook";
			} else if (showBooks != null) {
				return "showBooks";
			} else {
				return "index";
			}
		} catch (Exception e) {
			return "index";
		}
	}
}
