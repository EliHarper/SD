package com.skilldistillery.inheritance.labs.vehicles;

public class Automobile extends Vehicle {
	
	private String make;
	private String model;
	private int year;
	private int numberOfWheels;
	private double speedInMph;

	public Automobile() {
	}
	
	public Automobile(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph) {
		setPurchasePrice(purchasePrice);
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setNumberOfWheels(numberOfWheels);
		this.setSpeedInMph(speedInMph);
	}
	
	public String toString() {
		return "Automobile " + getPurchasePrice() + " " + getMake() + " "+ getModel() + " " + getYear()
				+ " " + getNumberOfWheels() + " " + getSpeedInMph();
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getSpeedInMph() {
		return speedInMph;
	}

	public void setSpeedInMph(double speedInMph) {
		this.speedInMph = speedInMph;
	}
	
}
