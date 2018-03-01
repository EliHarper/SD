package labs;

import java.util.Scanner;

public class LoopMenu {
	static int userInput = 0;
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		printMenu();
		}
		
	public static void printMenu() {
		while (true) {
			System.out.println("1. Greeting");
			System.out.println("2. Advice");
			System.out.println("3. Wisdom");
			System.out.println("4. Help");
			System.out.println("5. Quit");
			userInput = keyboard.nextInt();
			
			if (userInput ==1) {
				Greeting();
				continue;
			}
			else if (userInput == 2) {
				Advice();
				continue;
			}
			else if (userInput == 3) {
				Wisdom();
				continue;
			}
			else if (userInput == 4) {
				Help();
				continue;
			}
			else if (userInput == 5) {
				Quit();
				break;
			}
		}
	}
	
	public static void Greeting() {
		System.out.println("GREETINGS HUMAN");
	}
	
	public static void Advice() {
		System.out.println("I'm not good at advice.. May I interest you in a sarcastic comment?");
	}
	
	public static void Wisdom() {
		System.out.println("Don't mess with me, I know Karate, MMA and lots of other words.");
	}
	
	public static void Help() {
		System.out.println("This program, explained: Enter a number, get some output.");
	}
	
	public static void Quit() {
		System.out.println("Hasta Lou Gehrig.");
	}
}
