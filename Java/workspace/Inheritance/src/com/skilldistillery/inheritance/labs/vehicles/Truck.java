package com.skilldistillery.inheritance.labs.vehicles;


public class Truck extends Automobile {
	private int bedSizeInCubicFeet;
  public Truck() {

  }
  public Truck(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
      int bedSizeInCubicFeet) {
    setPurchasePrice(purchasePrice);   // Vehicle field
    this.setMake(make);                     // Automobile fields
    this.setModel(model);
    this.setYear(year);
    this.setNumberOfWheels(numberOfWheels);
    this.setSpeedInMph(speedInMph);
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
  
  
  
}
