package com.intuit;

public class CarFactory {

	public static Car getLatestBMWCar() {
		Car car = new Car();
		car.setModel("BMW");
		car.setYear(2020);
		return car;
	}
	
	public static Car getLatestVolvoCar() {
		Car car = new Car();
		car.setModel("Volvo");
		car.setYear(2022);
		return car;
	}
}
