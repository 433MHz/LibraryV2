package webapp.SpringConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import webapp.servlets.services.AddBookService;
import webapp.servlets.services.JDBC.AddBookJDBC;

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
}
