package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//CommandLineRunner used mainly in non-web applications
//Used to execute the core application logic AFTER initialization is complete


@SpringBootApplication
public class Day01SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day01SpringbootApplication.class, args);
	}
	
	//Car car = context.getBean("....");
	//container looks for a Car component, create an instance and assign it to this variable
	
	@Autowired
	private Car car;
	
	@Autowired
	private Person person;
	
	@Autowired
	private Company intuit;
	
	@Autowired
	private Company hp;
	
	@Autowired
	private Company fb;

	@Autowired
	private Training training;
	
	@Override
	public void run(String... args) throws Exception {
		//Called after the container completes all the initializations
		
		System.out.println(intuit);
		System.out.println(hp);
		System.out.println(fb);
		
		System.out.println(training.getName() + ", " + training.getTopics());
		
		
//		car.drive();
//		System.out.println(person.getCar().getModel());
		
	} 
	

}
