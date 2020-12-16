package webapp.SpringConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import webapp.servlets.filters.AddBookEmptyValueFilter;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Bean
	AddBookEmptyValueFilter getAddBookEmptyValueFilter() {
		return new AddBookEmptyValueFilter();
	}
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(getAddBookEmptyValueFilter()).addPathPatterns("/add");
	}
}
