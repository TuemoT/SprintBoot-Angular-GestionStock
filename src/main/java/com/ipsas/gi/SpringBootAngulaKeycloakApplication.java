package com.ipsas.gi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootAngulaKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngulaKeycloakApplication.class, args);
	}
	 
	/*
	 * public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 * 
	 * registry.addResourceHandler("swagger-ui.html")
	 * .addResourceLocations("classpath:/META-INF/resources/");
	 * 
	 * registry.addResourceHandler("/webjars/**")
	 * .addResourceLocations("classpath:/META-INF/resources/webjars/");
	 * 
	 * }
	 */


}
