package com.skilldistillery.objs.labs;

public class CarRepository {

	private Car car[];
	private int count = 0;
	private static int MAX_CARS = 100;
	
	public CarRepository() {
		car = new Car[MAX_CARS];
	}
	public void addCar(Car car) {
		this.car [count] = car;
		count++;
		
	}
	
	public Car[] getCars() {
		Car newCarArr[] = new Car[count];
		for (int i = 0; i < count; i++) {
			newCarArr[i] = car[i];
		}
		return newCarArr;
	}

}
