package com.skilldistillery.enums.drills.cards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DealCards extends Deck {

	private Deck deck = new Deck();

	public static void main(String[] args) {
		DealCards dc = new DealCards(); 
		dc.run();
	}

	private DealCards() {
		
	}
	
	protected void run() {
		
	Scanner kb = new Scanner(System.in);
	deck.checkDeckSize(deck.deck);
	deck.shuffle(deck.deck);
	int numCards = 0;
	while(true) {
	
		System.out.println("How many cards would you like?");
		try{
			numCards = kb.nextInt();
		}
		
		catch(InputMismatchException e){
			System.out.println("That's uh.. that's not a number ☉ ‿ ⚆");
		}
		
		if (numCards > 52) {
			System.out.println("You must not play cards. Try a number under 52.");
			return;
		}
			
		for (int i = 0; i < numCards; i++) {
			deck.run();
		}
		
		System.out.println("\nThere are " + deck.deck.size() + " cards left.");
		
	}
}
}
