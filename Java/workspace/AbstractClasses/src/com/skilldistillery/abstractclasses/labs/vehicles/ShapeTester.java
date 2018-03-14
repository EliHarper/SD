package com.skilldistillery.abstractclasses.labs.vehicles;

public class ShapeTester {

	public static void main(String[] args) {
		ShapeTester test = new ShapeTester();
		test.run();
	}
	
	private void run() {
		Shape c = new Circle(10);
		Shape r1 = new Rectangle(10, 20);
		Shape r2 = new Rectangle(10, 30);
		
		Shape[] sArray = {c, r1, r2};
		
		printArea(sArray);
	}
	
	public void printArea(Shape[] sArray) {
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].getClass().getSimpleName() + " area: ");
			System.out.println(sArray[i].getArea());
		}
		
	}

	public ShapeTester() {
	}
	
	
}
