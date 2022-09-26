package com.intuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//<bean id="car" class="com.intuit.Car"/>
@Component
public class Car {

	@Value("BMW")
	private String model;
	
	@Value("2020")
	private int year;
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}

	public void drive() {
		System.out.println("Driving " + model + " ( " + year + " model )");
	}
}
