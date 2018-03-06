package com.skilldistillery.characters.labs;

import java.util.Scanner;

public class AlphaNumCheck {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String userString = kb.nextLine();
		int count = 0;
		
		for (int i = 0; i < userString.length(); i++) {
			char c = userString.charAt(i);
			if ( c >64 && c <91|| c >96 && c<123) {
				count ++;
			}
		}
		if (count == userString.length()) {
			System.out.println("All characters in the string are letters.");
		}
		else {
			System.out.println("Some of these are not letters.");
		}
	}

}
