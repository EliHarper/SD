package labs;

import java.util.Scanner;

public class DailyRainfall {
	static Scanner keyboard = new Scanner(System.in);
	static double sun, mon, tues, wed, thurs, fri, sat, total;
	public static void main(String[] args) {
		DaysRain();
		Average();
	}
	public static void DaysRain(){
		System.out.println("Please enter the amount of rain on Sunday");
		sun = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Monday");
		mon = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Tuesday");
		tues = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Wednesday");
		wed = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Thursday");
		thurs = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Friday");
		fri = keyboard.nextDouble();
		System.out.println("Please enter the amount of rain on Saturday");
		sat = keyboard.nextDouble();
		
		total = sun + mon + tues + wed + thurs + fri + sat;
		
		System.out.println("The total amount of rain that we got this week was: "+ total);
		
	}
	public static void Average() {
		double average = total/7;
		System.out.println("The average rainfall per day was: "+average);
	}
}
