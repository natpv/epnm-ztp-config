package com.epnm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EpnmZtpConfigApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EpnmZtpConfigApplication.class, args);
	}
	
//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(EpnmZtpConfigApplication.class);
//    }

}
