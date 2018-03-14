package com.skilldistillery.abstractclasses.labs.vehicles;

public abstract class Shape {
	private int xCoord;
	private int yCoord;
	
	public abstract double getArea();	
	
	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	
	public Shape() {
		
	}
	
	
}
