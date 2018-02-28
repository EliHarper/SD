package labs;

import java.util.Scanner;

public class NumSign {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		run();
	}
	public static void run() {
		System.out.println("Pick a number, any number!");
		int number = keyboard.nextInt();
		if (number%2 == 0) {
			System.out.println(number + " is an even number!");
		}
		else {
			System.out.println(number + " is an odd number!");
		}
	}
}
