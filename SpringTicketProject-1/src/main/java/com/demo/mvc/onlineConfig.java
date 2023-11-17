package com.demo.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.mvc.filter.BusFilter;
@Configuration
public class onlineConfig implements WebMvcConfigurer{
	
	@Bean
	public BusFilter getFilter() {
		return new BusFilter();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}


	


}
