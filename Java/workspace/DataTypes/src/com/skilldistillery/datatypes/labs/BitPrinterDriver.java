package com.skilldistillery.datatypes.labs;

import java.util.Scanner;

public class BitPrinterDriver {

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		BitPrinter bp = new BitPrinter();
		
		while (true) {
			String input = getUserData();
			if ("QUIT".equals(input)) {
				System.out.println("GOODBYE!");
				break;
			}
			String bits = bp.getDataAsBits(input);
			System.out.println(input + " in bits is: "+ bits);
		}
		
		kb.close();
	}
	public static String getUserData() {
		System.out.println("Enter an int, double or char value. Type QUIT to exit.");
		String input = kb.next();
		return input;
	}
}
