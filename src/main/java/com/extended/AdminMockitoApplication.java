package com.extended;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.extended.service.RoleServiceImplementation;

@SpringBootApplication
public class AdminMockitoApplication {
	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImplementation.class);

	public static void main(String[] args) {
		logger.info("hai");
		SpringApplication.run(AdminMockitoApplication.class, args);
	}

}
