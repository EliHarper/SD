package com.skilldistillery.inheritance.labs.vehicles;

public class Vehicle {
	private double purchasePrice;
	
	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Vehicle() {
		
	}
	
	public Vehicle(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public String toString() {
		return "Vehicle " + purchasePrice;
	}

	

}
