package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Round {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		roundFloat();
	}
	private static void roundFloat() {
		System.out.println("Please enter a floating point number: ");
		double num = kb.nextDouble();
		int castNum = (int)num;
		int nearestNum;
		if (num>0) {
			if ((num - castNum) < 0.5) {
				nearestNum = castNum;
			}
			else {
				nearestNum = castNum+1;
			}
		}
		else {
			if ((num - castNum) < -0.5) {
				nearestNum = castNum -1;
			}
			else {
				nearestNum = castNum;
			
			}
		}
		
		System.out.println("The nearest integer is: " + nearestNum);
	}

}
