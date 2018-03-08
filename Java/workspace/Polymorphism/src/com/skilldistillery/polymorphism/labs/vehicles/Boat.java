package com.skilldistillery.polymorphism.labs.vehicles;

public class Boat extends Vehicle {

protected String name;
  protected double speedInKnots;
  protected int lengthInFeet;
  
  public Boat(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
    super(purchasePrice);
    this.name = name;
    this.speedInKnots = speedInKnots;
    this.lengthInFeet = lengthInFeet;
  }
  @Override
  public double calculateRegistrationFee(double rate) {
	  double fee = 0;
	  if (lengthInFeet>30) {
		  rate = rate*2;
		  fee = rate*getPurchasePrice();
	  }
	  else{
		  fee = rate*getPurchasePrice();
	  }
	  return super.calculateRegistrationFee(fee);
  }
  
  public int getLengthInFeet() {
    return lengthInFeet;
  }
  
}
