package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//Lombok library is used in projects
//It generates getter/setters, constructors etc
//@Data
@Component
public class Person {

	@Value("Sam")
	private String name;
	
	@Autowired
	private Car car;

	public String getName() {
		return name;
	}

	public Car getCar() {
		return car;
	}
	
}
