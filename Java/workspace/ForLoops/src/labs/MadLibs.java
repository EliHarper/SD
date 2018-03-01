package labs;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		story();
	}
	public static void story() {
		Scanner keyboard = new Scanner(System.in);
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
}
