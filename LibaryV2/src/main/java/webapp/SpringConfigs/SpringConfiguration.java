package webapp.SpringConfigs;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import webapp.objects.BookObject;
import webapp.servlets.services.AddBookService;
import webapp.servlets.services.ShowBooksService;
import webapp.servlets.services.JDBC.AddBookJDBC;
import webapp.servlets.services.JDBC.JdbcConnectionData;
import webapp.servlets.services.JDBC.ShowBooksJDBC;

@Configuration
@ComponentScan("webapp")
public class SpringConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	@Bean
	public AddBookService addBookService() {
		return new AddBookService();
	}
	
	@Bean
	public AddBookJDBC addBookJDBC() {
		return new AddBookJDBC();
	}
	
	@Bean
	public ModelAndView modelAndView() {
		return new ModelAndView();
	}
	
	@Bean
	public ShowBooksService showBooksService() {
		return new ShowBooksService();
	}
	
	@Bean
	public ShowBooksJDBC showBooksJDBC() {
		return new ShowBooksJDBC();
	}
	
	@Bean
	public BookObject bookObject() {
		return new BookObject();
	}
	
	@Bean
	public ArrayList<String[]> arrayList(){
		return new ArrayList<String[]>();
	}
	
	@Bean
	public JdbcConnectionData jdbcConnectionData() {
		return new JdbcConnectionData();
	}
	
}
