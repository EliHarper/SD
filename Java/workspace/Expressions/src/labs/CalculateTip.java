package labs;

import java.util.Scanner;

public class CalculateTip {
	static double tipTotal;
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		Tip();
		System.out.println("Your total is: " + tipTotal);
		
		
	}
	
	public static void Tip() {
		System.out.println("How much was your bill for?");
		double bill = keyboard.nextDouble();
		System.out.println("Was your service bad, good, or great?");
		String service = keyboard.next();
		if (service.equals("bad")) {
			tipTotal = (bill*.1)+bill;
			return;
		} 
		
		else if (service.equals("good")) {
			tipTotal = (bill*.15)+bill;
			return;
		}
		else if (service.equals("great")) {
			tipTotal = (bill*.2)+bill;
			return;
		}
	}
}
