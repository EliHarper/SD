package labs;

import java.util.Scanner;

public class MadLibs {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Would you like to hear a short or a long story?");
		String shortOrLong = keyboard.next();
		if (shortOrLong.equalsIgnoreCase("short")) {
			story();
		}
		else if (shortOrLong.equalsIgnoreCase("long")) {
			longStory();
		}
	}
	public static void story() {
		String verb, noun, adjective, adverb, pluralNoun;
		System.out.println("Please enter a verb");
		verb = keyboard.nextLine();
		System.out.println("Please enter a noun");
		noun = keyboard.nextLine();
		System.out.println("Please enter an adjective");
		adjective = keyboard.nextLine();
		System.out.println("Please enter an adverb");
		adverb = keyboard.nextLine();
		System.out.println("Please enter a plural noun");
		pluralNoun = keyboard.nextLine();
		System.out.println("A " + adjective + " " + noun + " " + verb + " " + adverb + " past the " + pluralNoun );
		
	}
	public static void longStory() {
		
		String verb, noun, adverb, pluralNoun, adjective;
		System.out.println("Please enter a verb");
		verb = keyboard.nextLine();
		System.out.println("Please enter a noun");
		noun = keyboard.nextLine();
		System.out.println("Please enter an adjective");
		adjective = keyboard.nextLine();
		System.out.println("Please enter an adverb");
		adverb = keyboard.nextLine();
		System.out.println("Please enter a plural noun");
		pluralNoun = keyboard.nextLine();
		System.out.println("Once upon a time there was a " + noun + " and it absolutely loved to " + verb + " whenever it woke up. One day, when it was feeling particularly ");
		System.out.print(adjective + ", it ran to school to greet all of its classmates, who were all " + pluralNoun + ". When he arrived, they all told him that his dog had been playing in ");
		System.out.print("the schoolyard " + adverb + " all morning.");
	}
}
