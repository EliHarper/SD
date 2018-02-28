package labs;

import java.util.Scanner;

public class IfCelsFahr {
	static Scanner keyboard = new Scanner(System.in);
	static String scale;
	static double Fahrenheit, Celsius;
	public static void main(String[] args) {
		System.out.println("Is the value that you have in Celsius or Fahrenheit?");
		scale = keyboard.next();
		
		CelsToFahr();
		FahrToCels();
	}
	public static void CelsToFahr() {
		
		if (scale.equalsIgnoreCase("Celsius")) {
			System.out.println("What is the temperature in Celsius?");
			Celsius = keyboard.nextDouble();
			Fahrenheit = (9.0/5.0 * Celsius) +32;
			
			System.out.println(Celsius + " degrees Celsius is equal to " + Fahrenheit + " degrees Fahrenheit.");
		} 
		else if (scale.equalsIgnoreCase("C")) {
			System.out.println("What is the temperature in Celsius?");
			Celsius = keyboard.nextDouble();
			Fahrenheit = (9.0/5.0 * Celsius) +32;
			
			System.out.println(Celsius + " degrees Celsius is equal to " + Fahrenheit + " degrees Fahrenheit.");
		} 
		else {
			System.out.println("Scale not recognized.. Please try again.");
			main(null);
		}
	}
	
	public static void FahrToCels() {
		if (scale.equalsIgnoreCase("Fahrenheit")) {
			System.out.println("What is the temperature in Fahrenheit?");
			Fahrenheit = keyboard.nextDouble();
			Celsius = 5.0/9.0 * (Fahrenheit -32);
			System.out.println(Fahrenheit + " degrees Fahrenheit is equal to " + Celsius + " degrees Celsius.");
		}
		else if (scale.equalsIgnoreCase("F")) {
			System.out.println("What is the temperature in Fahrenheit?");
			Fahrenheit = keyboard.nextDouble();
			Celsius = 5.0/9.0 * (Fahrenheit -32);
			System.out.println(Fahrenheit + " degrees Fahrenheit is equal to " + Celsius + " degrees Celsius.");
		}
	}

}
