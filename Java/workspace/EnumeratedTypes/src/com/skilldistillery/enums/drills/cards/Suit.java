package com.skilldistillery.enums.drills.cards;

public enum Suit {
	
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	private String name;

	Suit(String n){
		name = n; 
	}
	
	@Override
	public String toString() {
		return this.name();
	}


}



