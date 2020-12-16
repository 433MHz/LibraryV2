package webapp.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageRelocator {

	@RequestMapping("/relocate")
	public RedirectView relocate(HttpServletRequest request, HttpServletResponse response) {
		String addBook = request.getParameter("b1");
		String showBooks = request.getParameter("b2");
		try {
			if (addBook != null) {
				return new RedirectView("addBook");
			} else if (showBooks != null) {
				return new RedirectView("showBooks");
			} else {
				return new RedirectView("index");
			}
		} catch (Exception e) {
			return new RedirectView("index");
		}
	}
}
