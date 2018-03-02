package labs;

import java.util.Scanner;

public class DMVSimulator {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		getCarData();
		
		
	}
	public static void getCarData() {
		
		Car car = new Car();
		
		System.out.println("What color is the car?");
		car.color = keyboard.next();
		System.out.println();
		System.out.println("How much did you buy the car for?");
		car.purchasePrice = keyboard.nextDouble();
		System.out.println();
		System.out.println("What is the make of the car?");
		System.out.println();
		car.make = keyboard.next();
		System.out.println("What is the model of the car?");
		System.out.println();
		car.model = keyboard.next();
		System.out.println("How many wheels does the car have?");
		System.out.println();
		car.numberOfWheels = keyboard.nextInt();
	}
}
