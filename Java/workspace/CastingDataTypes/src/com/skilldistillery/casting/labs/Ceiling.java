package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Ceiling {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		ceiling();
		kb.close();
	}
	public static void ceiling() {
		System.out.println("Please enter a floating point number: ");
		double num = kb.nextDouble();
		if (num > 0) {
			num = (int)num;
			num = num+1;
			System.out.println("The smallest integer greater than or equal to that number is: " + num);
		} 
		else {
			num = (int)num;
			System.out.println("The smallest integer greater than or equal to that number is: " + num);
		}
	}
}
