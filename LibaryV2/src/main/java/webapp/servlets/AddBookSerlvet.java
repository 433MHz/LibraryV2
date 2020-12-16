package webapp.servlets;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webapp.servlets.services.AddBookService;

@Controller
public class AddBookSerlvet {
	
	@Autowired
	AddBookService addBookService;
	@Autowired
	ModelAndView modelAndView;
	
	@RequestMapping("/add")
	public ModelAndView modelAndView(HttpServletRequest request) {
		
		modelAndView.setViewName("addBook");
		modelAndView.addObject("message", addBookService.add(request));
		return modelAndView;
	}
}
