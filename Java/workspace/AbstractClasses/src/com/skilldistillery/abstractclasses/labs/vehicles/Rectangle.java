package com.skilldistillery.abstractclasses.labs.vehicles;

public class Rectangle extends Shape {
	
	private double width, height;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", getWidth()=");
		builder.append(getWidth());
		builder.append(", getHeight()=");
		builder.append(getHeight());
		builder.append(", getxCoord()=");
		builder.append(getxCoord());
		builder.append(", getyCoord()=");
		builder.append(getyCoord());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}

	@Override
	public double getArea() {
		double area = height*width;
		return area;
	}

}
