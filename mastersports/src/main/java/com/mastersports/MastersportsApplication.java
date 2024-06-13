package com.mastersports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MastersportsApplication  extends SpringBootServletInitializer{


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MastersportsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MastersportsApplication.class, args);
	}
}
