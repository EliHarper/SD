package com.skilldistillery.games.whiterabbit.items;

public abstract class Food implements GameItem {
	private double alterationFactor;
	private String name;
	public Food(double alterationFactor, String name) {
		super();
		this.alterationFactor = alterationFactor;
		this.name = name;
	}
	public double getAlterationFactor() {
		return alterationFactor;
	}
	public void setAlterationFactor(double alterationFactor) {
		this.alterationFactor = alterationFactor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//override GameItem's alterGameCharacter
	//multiply character's height by alterationFactor
	//then set character's height
	//if the character's height ends up < 1, set it to 1.
	
}


