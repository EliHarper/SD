package labs;

import java.util.Scanner;

public class NumFactors {
	static Scanner keyboard = new Scanner(System.in);
	static int number;
	public static void main(String[] args) {
		run();
		multOfTen();
		multOfHundred();
	}
	public static void run() {
		System.out.println("Pick a number, any number!");
		number = keyboard.nextInt();
		if (number > 0) {
			if(number%2 ==0) {
				System.out.println(number + " is an even number!");
			}
			else if (number%2 ==1){
				System.out.println(number + " is an odd number!");
			}
		}
		else if (number == 0) {
			System.out.println("You entered zero for whatever reason!");
		}
		else {
			System.out.println("Please enter a positive number!");
			run();
		}
	}
	
	public static void multOfTen() {
		if (number%10==0) {
			System.out.println(number + " is divisible by 10!");
		}
		else {
			System.out.println(number + " is not divisible by 10!");
		}
	}
	public static void multOfHundred() {
		if (number%100==0) {
			System.out.println(number + " is divisible by 100!");
		}
		else {
			System.out.println(number + " is not divisible by 100!");
		}
	}
}
