package com.skc.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.skc" })
public class SampleAppApplication {
	
	private static Logger logger = LogManager.getLogger(SampleAppApplication.class);

	public static void main(String[] args) {
		logger.debug("App Service Starting");
		SpringApplication.run(SampleAppApplication.class, args);
	}
	
}
