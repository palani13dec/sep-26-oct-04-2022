package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day03DbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day03DbApplication.class, args);
	}

	@Autowired
	private PersonsDao personsDao;
	
	@Override
	public void run(String... args) throws Exception {
		//personsDao.insertPerson("Ram", 32);
		//System.out.println("Done");
		System.out.println(personsDao.getNames());
	}

}
