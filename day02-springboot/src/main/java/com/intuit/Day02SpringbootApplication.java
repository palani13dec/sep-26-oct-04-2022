package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day02SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day02SpringbootApplication.class, args);
	}

	@Autowired
	private Car car1;
	
	@Autowired
	private Company company;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(car1.getModel() + ", " + car1.getYear());
		System.out.println(company);
		
	}
}
