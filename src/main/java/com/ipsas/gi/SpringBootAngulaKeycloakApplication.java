package com.ipsas.gi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootAngulaKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngulaKeycloakApplication.class, args);
	}

}
