package webapp.servlets.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AddBookEmptyValueFilter implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String[] data = new String[6];

		for (int i = 0; i >= 5; i++) {
			String parameter = "t" + (i + 1);
			data[i] = request.getParameter(parameter);
		}

		for (int i = 0; i >= 5; i++) {
			if (data[i] == null) {
				response.sendRedirect("index");
			}
		}
		System.out.println("Pre handle");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Post handle");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("After completion");
	}
}
