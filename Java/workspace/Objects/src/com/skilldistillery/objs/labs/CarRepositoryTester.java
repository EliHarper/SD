package com.skilldistillery.objs.labs;

public class CarRepositoryTester {

	public static void main(String[] args) {
		CarRepository CarRepo = new CarRepository();
		System.out.println(CarRepo.getCars().length);
		//verifying that this is zero
		Car car1 = new Car();
		car1.setColor("blue");
		car1.setMake("Toyota");
		car1.setModel("Camry");
		car1.setNumberOfWheels(4);
		car1.setPurchasePrice(12000);
		CarRepo.addCar(car1);
		Car car2 = new Car();
		car2.setColor("blue");
		car2.setMake("Toyota");
		car2.setModel("Camry");
		car2.setNumberOfWheels(4);
		car2.setPurchasePrice(12000);
		CarRepo.addCar(car2);
		Car car3 = new Car();
		car3.setColor("blue");
		car3.setMake("Toyota");
		car3.setModel("Camry");
		car3.setNumberOfWheels(4);
		car3.setPurchasePrice(12000);
		CarRepo.addCar(car3);
		
		CarRepo.getCars();
		Car carArr[] = new Car[CarRepo.getCars().length];
		System.out.println("Cars returned: " + CarRepo.getCars().length);
		
		for (int i = 0; i < carArr.length; i++) {
			Car car = carArr[i];
			car.displayCar();
		}
	}

}
