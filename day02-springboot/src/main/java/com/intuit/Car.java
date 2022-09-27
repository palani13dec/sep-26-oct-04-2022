package com.intuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value("${car.make}")
	private String model;
	@Value("${car.yearOfRelease}")
	private int year;
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
}
