package deafGrandma;

import java.util.Scanner;

public class deafGrandma {
	public static void main(String[] args) {
		response();
	}
	public static void response() {
		Scanner kb = new Scanner (System.in);
		System.out.println("What would you like to say to your grandma?");
		String say = kb.nextLine();
		
		if (say.equals("GOODBYE")) {
			System.out.println("SMELL YA LATER!");
		}
		else if (say.equals("WHERE'S GRANDPA")) {
			System.out.println("WHO?!");
		}
		else if (say.equals(say.toUpperCase())) {
			System.out.println("NO, NOT SINCE THE WAR");
			response();
		}
		else {
			System.out.println("HUH? SPEAK UP, BILLY!!");
			response();
		}
	}
}
