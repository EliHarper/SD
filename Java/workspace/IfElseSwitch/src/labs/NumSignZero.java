package labs;

import java.util.Scanner;

public class NumSignZero {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		run();
	}
	public static void run() {
		System.out.println("Pick a number, any number!");
		int number = keyboard.nextInt();
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
}