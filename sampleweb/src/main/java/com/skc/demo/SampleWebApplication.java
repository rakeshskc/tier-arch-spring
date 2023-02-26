package com.skc.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.skc"})
public class SampleWebApplication extends SpringBootServletInitializer {

	private static Logger logger = LogManager.getLogger(SampleWebApplication.class);
	
	public static void main(String[] args) {
		logger.debug("Web Service Starting");
		SpringApplication.run(SampleWebApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
