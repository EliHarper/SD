package labs;

import java.util.Scanner;

public class FahrToCels {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit: ");
		double degF = keyboard.nextDouble();
		
		double degC = (degF - 32)*.5556;
		
		System.out.println("The temperature is "+degC+" degrees Celsius");
	}
}
