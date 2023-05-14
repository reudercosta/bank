package com.reuder.apiRestConductor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class ApiRestConductorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestConductorApplication.class, args);
	}
	
	public String teste(String index) {
		return "index.html";
	}
}
