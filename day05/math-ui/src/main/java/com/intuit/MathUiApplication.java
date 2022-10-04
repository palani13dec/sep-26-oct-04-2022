package com.intuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MathUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathUiApplication.class, args);
	}

}
