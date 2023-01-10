package com.mockApi.mockApiApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.mockApi.mockApiApp.Component.RequestLoggingFilter;

@SpringBootApplication
public class MockApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockApiAppApplication.class, args);
	}
	
	/*
	 * @Bean public FilterRegistrationBean<RequestLoggingFilter> loggingFilter(){
	 * FilterRegistrationBean<RequestLoggingFilter> registrationBean = new
	 * FilterRegistrationBean<>();
	 * 
	 * registrationBean.setFilter(new RequestLoggingFilter());
	 * registrationBean.addUrlPatterns("/*");
	 * 
	 * return registrationBean; }
	 */

}
