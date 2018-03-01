package drills;

import java.util.Scanner;

public class CalculateTemp {
	static double temperatureC, temperatureF;
	static Scanner keyboard = new Scanner (System.in);
	public static void main(String[] args) {
		// 2. Call the method to calculate temperature.
		// Be sure to pass arguments in the correct order.
		// Print the returned value to the screen.		
		char scale;
		System.out.println("Please enter the scale of temperature that you have (C/F): ");
		String scaleString = keyboard.next();
		if (scaleString.equalsIgnoreCase("C")) {
			scale = 'C';
			System.out.println("Please enter the temperature in Celsius: ");
			temperatureC = keyboard.nextDouble();
			calculateTemp(temperatureC, scale);
			System.out.println(temperatureC +" degrees C is " + calculateTemp(temperatureC, scale) +" degrees F.");
		}
		else if (scaleString.equalsIgnoreCase("F")) {
			scale = 'F';
			System.out.println("Please enter the temperature in Fahrenheit: ");
			temperatureF = keyboard.nextDouble();
			calculateTemp(temperatureF, scale);
			System.out.println(temperatureF +" degrees F is " + calculateTemp(temperatureF, scale) +" degrees C.");
		}
		else {
			System.out.println("Please enter either \"T\" or \"F\"");
			main(null);
		}
	}

	
	public static double calculateTemp(double temperatureF, char scale) {
		double newTemp = 0;
		if (scale == 'F') {
			newTemp = (temperatureF - 32) / 1.8;
		}
		
		else if (scale == 'C') {
			newTemp = (temperatureC * 1.8) + 32;
		}
		return newTemp;
	}
	// 1. Define a method with the following signature:
	// name: calculateTemp
	// return type: double
	// parameter 1: floating point temperature
	// parameter 2: a character denoting the temperature scale,
	//              where 'C' means Celsius and 'F' means Fahrenheit
	//
	// Be sure to put "public static" in front of the method return type and name
	// 
	// The method will calculate the alternate temperature 
	// using the formulas
	// 
	//
	// If the scale is not 'C' or 'F', print a message to the screen and
	// return the value -999.
	
	
	

}
