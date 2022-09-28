package com.intuit;

import java.util.List;
import java.util.Optional;

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
	private PersonsDaoUsingJdbc personsDaoUsingJdbc;
	
	@Autowired
	private PersonsDao personsDao;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(personsDao.getClass().getName());
		//personsDaoUsingJdbc.insertPerson("Ram", 32);
		//System.out.println("Done");
		//System.out.println(personsDaoUsingJdbc.getNames());
		
		Person person = new Person();
		person.setName("Sachin");
		person.setAge(48);
		personsDao.save(person);
		
		List<Person> persons = personsDao.findAll();
		System.out.println(persons);
		
		//IMPLEMENT Update age of a person with id say 1
		int newAge = 45;
		Optional<Person> optPerson = personsDao.findById(1);
		if(optPerson.isPresent()) {
			Person personObj = optPerson.get();
			personObj.setAge(newAge);
			personsDao.save(personObj);
		}
		
		
	}

}
