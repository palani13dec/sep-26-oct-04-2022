package com.intuit;

public class Car {

	private String model;
	private int year;
	private Engine engine;
	
	

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void drive() {
		System.out.println("Driving " + model + "(" + year + " model)");
	}
	
}
