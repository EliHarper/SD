package com.skilldistillery.characters.labs;

import java.util.Scanner;

public class AlphaNumCheck2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String userString = kb.nextLine();
		int count = 0;
		
		for (int i = 0; i < userString.length(); i++) {
			char c = userString.charAt(i);
			if ( c >64 && c <91
					|| c >96 && c<123 
					|| c>47 && c<58 
					|| c ==32) {
				count ++;
				System.out.println(c + " is a letter, number or space.");
			}
			else {
				System.out.println(c + " is a crazy symbol");
			}
		}
		if (count == userString.length()) {
			System.out.println("All characters in the string are alphanumeric or a space.");
		}
		else {
			System.out.println("Some of these are non-alphanumeric symbols.");
		}
		kb.close();
	}

}
