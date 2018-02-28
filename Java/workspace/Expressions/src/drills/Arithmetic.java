package drills;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Run this program with several numbers. What happens to the remainder when you
		// do
		// integer division?
		// Returns an int w/ no remainder
		doDivision();
		System.out.println("Would you like to find a remainder? (y/n): ");
		String doRemainder = keyboard.next();

		if (doRemainder.equals("y")) {
			doModulus();
			System.out.println("Would you like to find a quotient as a double? (y/n): ");
			String doDouble = keyboard.next();
			if (doDouble.equals("y")) {
				doRealDivision();
			}

			else {
				
			}

		} else {
			System.out.println("Would you like to find a quotient as a double? (y/n): ");
			String doDouble = keyboard.next();
			if (doDouble.equals("y")) {
				doRealDivision();
			}

			else {
				
			}
		}
		// Comment out the call to doDivision();
		// Uncomment the call to doModulus();
	}

	static void doDivision() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		int quotient = dividend / divisor;
		System.out.println("quotient = " + quotient);
	}

	static void doModulus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.println("\tRemainder: amount left over from division");
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the dividend: ");
		int divisor = sc.nextInt();
		int remainder = dividend % divisor;
		// Complete the method and use the modulus operator to find the remainder.
		System.out.println("Your remainder is: " + remainder);
	}

	static void doRealDivision() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a dividend: ");
		double dividend = sc.nextInt();
		System.out.print("Enter a divisor: ");
		double divisor = sc.nextInt();
		double quotient = dividend / divisor;
		System.out.println("Your quotient, represented as a double, is: " + quotient);
	}

}
