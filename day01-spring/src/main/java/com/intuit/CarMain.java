package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		
		//This is the container
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Car bmw = context.getBean("bmw", Car.class);
		bmw.drive();
		
		Car volvo = context.getBean("volvo", Car.class);
		volvo.drive();
		
		Person sam = context.getBean("person1", Person.class);
		System.out.println(sam.getCar().getModel());
		System.out.println(sam.getCar().getEngine().getPower());
		
		
		
		
		
		
		
		//You won't be needing to create factory classes
		
//		Car bmw = CarFactory.getLatestBMWCar();
//		bmw.drive();
//		
//		Car volvo = CarFactory.getLatestVolvoCar();
//		volvo.drive();

	}

}
