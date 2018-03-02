package labs;

import java.util.Scanner;

public class ThermometerDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a temperature: ");
		double temp = keyboard.nextDouble();

		System.out.println("Enter a scale: ");
		String scale = keyboard.next();
		char scaleChar = scale.charAt(0);

		System.out.println(temp + " degrees " + scaleChar);

		System.out.println();

		Thermometer t = new Thermometer();
		t.currentTemp = temp;
		t.scale = scaleChar;

		double fahr = t.getTempAsFahrenheit();
		double cels = t.getTempAsCelsius();

		System.out.print(temp + " in Fahrenheit: " + fahr + "\n");
		System.out.print(temp + " in Celsius: " + cels);

		keyboard.close();
	}

}
