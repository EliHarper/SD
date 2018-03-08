package com.skilldistillery.objs2.labs;

public class CarInventoryManager {
	
	private CarRepository repo;
	
	{
		repo = new CarRepository();
	}
	
	public void addCar(Car car) {
		//adds a car to the car inventory
		repo.addCar(car);
	}
	
	public Car[] findCarsByModel(String model) {
		Car carsByModel[] = null;
		Car cars[] = repo.getCars();
		
//		This method must return an array of the correct size, so you may want to determine the number of cars with the matching model first.
		
		boolean[] matchingIndexes = new boolean[cars.length];
		int matchingIndexCounter = 0;
		
		for (int i = 0; i < cars.length; i++) {
			if (model.equals(cars[i].getModel())) {
				matchingIndexes[i] = true;
				matchingIndexCounter++;
			}
		}
		
		carsByModel = new Car[matchingIndexCounter];
		int carsByModelCounter = 0;
		
		for (int i = 0; i < matchingIndexes.length; i++) {
			if (matchingIndexes[i]) {
				carsByModel[carsByModelCounter] = cars[i];
				carsByModelCounter++;
			}
		}
		
		return carsByModel;
	}
	
	public Car[] getAllCars() {
		Car[] repoCars = repo.getCars();
		Car[] allCars = new Car[repoCars.length];
		//returns an array of all cars in the inventory
		
		for (int i = 0; i < allCars.length; i++) {
			allCars[i] = repoCars[i];
		}
		
		return allCars;
		
	}
}
