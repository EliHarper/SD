package com.skilldistillery.polymorphism.labs.vehicles;

public class Truck extends Automobile {
  protected int bedSizeInCubicFeet;

  public Truck(double purchasePrice, String make, String model, int year, int numberOfWheels, double speedInMph,
      int bedSizeInCubicFeet) {
    super(purchasePrice, make, model, year, numberOfWheels, speedInMph);
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }
  
  public int getBedSizeInCubicFeet() {
    return bedSizeInCubicFeet;
  }
  
  public void setBedSizeInCubicFeet(int bedSizeInCubicFeet) {
    this.bedSizeInCubicFeet = bedSizeInCubicFeet;
  }

@Override
public String toString() {
	return "Truck [bedSizeInCubicFeet=" + bedSizeInCubicFeet + ", getBedSizeInCubicFeet()=" + getBedSizeInCubicFeet()
			+ ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
			+ ", getNumberOfWheels()=" + getNumberOfWheels() + ", getSpeedInMph()=" + getSpeedInMph()
			+ ", getPurchasePrice()=" + getPurchasePrice() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}
  
@Override
public double calculateRegistrationFee(double rate) {
	  double fee = 0;
	  if (getNumberOfWheels() > 5) {
		rate = rate*1.5;
		fee = rate*getPurchasePrice();
	  }
	  else {
		  fee = rate*getPurchasePrice();
	  }
	  return super.calculateRegistrationFee(fee);
}
  
  
}
