package com.skilldistillery.inheritance.labs.vehicles;

public class VehicleTestApp {

	public static void main(String[] args) {
		Automobile auto = new Automobile(17_000, "Kia", "Optima", 2007, 4, 160);
		Truck truck = new Truck(20_000, "Chevrolet", "Silverado", 2010, 6, 100, 60);
		Boat boat = new Boat(100_000, 30, 40, "Queen's Gambit");
		
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = auto;
		
		System.out.println(auto.toString());
		System.out.println(truck.toString());
		System.out.println(boat.toString());
	}

}
