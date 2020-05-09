package com.gestion.gi.configuration;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;

import com.gestion.gi.SpringBootAngulaKeycloakApplication;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = SpringBootAngulaKeycloakApplication.class)
 class SecurityConfig extends KeycloakSecurityContext
{

	
}