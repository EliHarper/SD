package com.skilldistillery.namegen;

import java.util.Scanner;

public class NameGenerator {

	public static String firstNames[] = 
		{
				"The",
				"Tha",
				"Amazing",
				"Wonderful",
				"Cordial",
				"Impeccable",
				"Stylin'",
				"Shoutin'",
				"Armchair",
				"Argumentative",
				"Desperate",
				"Analagous",
				"Graduate",
				"Childish",
				"Annual",
				"Dogmatic",
				"Violent",
				"Expert",
				"Smilin'",
				"Drunken",
				"Structural",
				"Vulgar",
				"Foolish",
				"Mad",
				"Inspector",
				"Captain",
				"Colonel",
				"Lazy",
				"Solid",
				"Dynamic",
				"Angry",
				"Visual",
				"Exemplary",
				"Insane",
				"Arrogant",
				"Polymorphic",
				"Multidimensional"
		};
	
	public static String lastNames [] =
		{
				"Developer",
				"Ambassador",
				"Programmer",
				"Protector",
				"Funk",
				"Philosopher",
				"Monster",
				"Outsider",
				"Master",
				"Chieftain",
				"Despot",
				"Artist",
				"Creator",
				"Warrior",
				"Pupil",
				"Watcher",
				"Conqueror",
				"Mastermind",
				"Structure",
				"Wanderer",
				"Overlord",
				"Samurai",
				"Menace",
				"Clinician",
				"Doctor",
				"Leader",
				"Destroyer",
				"Commander",
				"Menace",
				"Specialist",
				"Exception",
				"Crusader",
				"CEO",
				"President",
				"Baller",
				"Carcinogen",
				"2D Array"
		};
	
	public static String translateFirstName(String fn) {
		String newFirstName = "";
//		int index = (int) (Math.random() * firstNames.length);
		int index = getFirstArrayIndexFromName(fn);
		newFirstName = firstNames[index];
		return newFirstName;
	}
	
	public static int getFirstArrayIndexFromName(String name) {
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			index += c;
		}
		//index must be within 0 to end of array (length - 1)
		
		index = index % firstNames.length;
		
		return index;
	}
	public static int getLastArrayIndexFromName(String name) {
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			index += c;
		}
		//index must be within 0 to end of array (length - 1)
		
		index = index % lastNames.length;
		
		return index;
	}

	public static String translateLastName(String ln) {
		String newLastName = "";
		int index = getLastArrayIndexFromName(ln);
		newLastName = lastNames[index];
		return newLastName;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = kb.next();
		firstName = firstName.toUpperCase();
		System.out.print("Enter your last name: ");
		String lastName = kb.next();
		lastName = lastName.toUpperCase();
		
		String translatedFN = translateFirstName(firstName);
		String translatedLN = translateLastName(lastName);
		
		System.out.print("Your name is: " + translatedFN);
		System.out.println(" " + translatedLN);
		
	}
}
