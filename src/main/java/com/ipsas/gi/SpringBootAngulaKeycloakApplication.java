package com.ipsas.gi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;







@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
public class SpringBootAngulaKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngulaKeycloakApplication.class, args);
	}
	 
	
}
