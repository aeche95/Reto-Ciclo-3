package com.ciclo3.reto.Configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
	
	protected void configure(HttpSecurity http) throws Exception { 
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and
		().csrf().disable(); 
		}

}
