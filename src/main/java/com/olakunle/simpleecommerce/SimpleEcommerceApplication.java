package com.olakunle.simpleecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class SimpleEcommerceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleEcommerceApplication.class, args);
	}

}
