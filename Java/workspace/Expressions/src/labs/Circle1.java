package labs;

import java.util.Scanner;

public class Circle1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius of your circle: ");
		double radius = keyboard.nextDouble();
		
		double circumference = 2*3.14159*radius;
		
		System.out.println("The circumference of your circle is: " + circumference + "units.");
		System.out.println("The radius of your circle is: "+ radius);
		
		keyboard.close();
	}

}
