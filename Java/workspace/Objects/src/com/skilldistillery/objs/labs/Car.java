package com.skilldistillery.objs.labs;

public class Car {
  private String make;
  private String model;
  private String color;
  private int numberOfWheels;
  private double purchasePrice;

  public String getCarData() {
    String output = "make=" + getMake() + ", model=" + getModel() + ", color=" + getColor() + ", numberOfWheels=" + getNumberOfWheels()
        + ", purchasePrice=" + getPurchasePrice();
    return output;
  }

  public void displayCar() {
    String carData = getCarData();
    System.out.println(carData);
  }

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
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

public int getNumberOfWheels() {
	return numberOfWheels;
}

public void setNumberOfWheels(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
}

public double getPurchasePrice() {
	return purchasePrice;
}

public void setPurchasePrice(double purchasePrice) {
	this.purchasePrice = purchasePrice;
}
}
