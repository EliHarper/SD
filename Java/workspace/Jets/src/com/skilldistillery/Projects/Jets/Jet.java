package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public abstract class Jet {
	protected static AirField airfield = new AirField();
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, long price, int range) {
		this.setModel(model);
		this.price = price;
		this.setSpeed(speed);
		this.setRange(range);
	}
	
	
	public void fly(ArrayList <Jet> jets) {
		
	}
	
	public double getSpeedInMach(double speed) {
		double speedInMach = 0;
		speedInMach = this.speed * 0.00130332;
		
		return speedInMach;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet model:");
		builder.append(model);
		builder.append(",\t\t speed: ");
		builder.append(speed);
		builder.append(",\t\t range: ");
		builder.append(range);
		builder.append(",\t\tSpeed in Mach: ");
		builder.append(getSpeedInMach(speed));
		builder.append(",\t\t price: ");
		builder.append(price);
		builder.append("");
		return builder.toString();
	}


	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}


	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
}

