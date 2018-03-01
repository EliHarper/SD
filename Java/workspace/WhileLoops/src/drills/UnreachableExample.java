package drills;

import java.util.Scanner;

public class UnreachableExample {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.print("Enter a number: ");
			int num = keyboard.nextInt();
			if (num%2 != 0) {				
				continue;
			}
			System.out.println("Thanks!");
			break;
		}
	}

}
