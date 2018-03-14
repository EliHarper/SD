package com.skilldistillery.abstractclasses.labs.vehicles;

public class Circle extends Shape {

	private double radius;
	
	public Circle(int r) {
		this.radius = r;
	}

	@Override
	public double getArea() {
		double area = Math.pow(radius, 2)*Math.PI;
		
		return area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [getxCoord()=");
		builder.append(getxCoord());
		builder.append(", getyCoord()=");
		builder.append(getyCoord());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", getRadius()=");
		builder.append(getRadius());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
