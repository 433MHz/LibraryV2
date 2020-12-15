package webapp.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import webapp.servlets.services.ShowBooksService;

@Controller
public class ShowBooksServlet {
	
	@Autowired
	ModelAndView modelAndView;
	
	@Autowired
	ShowBooksService showBooksService;
	
	@RequestMapping("/showBooks")
	public ModelAndView modelAndView() {
		modelAndView.setViewName("showBooks");
		modelAndView.addObject("result", showBooksService.getData());
		return modelAndView;
	}
}