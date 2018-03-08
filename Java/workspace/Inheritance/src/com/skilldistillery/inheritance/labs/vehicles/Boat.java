package com.skilldistillery.inheritance.labs.vehicles;

public class Boat extends Vehicle {
	private String name;
	private double speedInKnots;
	private int lengthInFeet;

	
	public Boat() {
	}
	public Boat(double purchasePrice, double speedInKnots, int lengthInFeet, String name){
		this.lengthInFeet = lengthInFeet;
		setPurchasePrice(purchasePrice);
		this.speedInKnots = speedInKnots;
		this.name = name;
	}
		
}
	
	

