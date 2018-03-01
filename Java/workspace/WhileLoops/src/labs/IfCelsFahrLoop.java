package labs;

import java.util.Scanner;

public class IfCelsFahrLoop {
	static Scanner keyboard = new Scanner(System.in);
	static String scale;
	static double Fahrenheit, Celsius;
	public static void main(String[] args) {
		ifCelsFahrLoop();
	}
	public static void CelsToFahr() {
		
		Celsius = keyboard.nextDouble();
		Fahrenheit = (9.0/5.0 * Celsius) +32;
			
		System.out.println(Celsius + " degrees Celsius is equal to " + Fahrenheit + " degrees Fahrenheit.");
	}
	
	public static void FahrToCels() {
		Fahrenheit = keyboard.nextDouble();
		Celsius = 5.0/9.0 * (Fahrenheit -32);
		System.out.println(Fahrenheit + " degrees Fahrenheit is equal to " + Celsius + " degrees Celsius.");
	}
	
	public static void ifCelsFahrLoop() {
		
		int count =0;
		while (true) {
			System.out.println("Is the value that you have in Celsius or Fahrenheit?");
			scale = keyboard.next();
			
			if (scale.equalsIgnoreCase("Celsius")) {
				System.out.println("What is the temperature in Celsius?");
				CelsToFahr();				
			}
			else if (scale.equalsIgnoreCase("C")) {
				System.out.println("What is the temperature in Celsius?");
				CelsToFahr();
			}
			
			if (scale.equalsIgnoreCase("Fahrenheit")) {
				System.out.println("What is the temperature in Fahrenheit?");
				FahrToCels();
			}
			else if (scale.equalsIgnoreCase("F")) {
				System.out.println("What is the temperature in Fahrenheit?");
				FahrToCels();
			}
			
			count +=1;
			if (count == 5) {
				break;
			}
		}
	}

}