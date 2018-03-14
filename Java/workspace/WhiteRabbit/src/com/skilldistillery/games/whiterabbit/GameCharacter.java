package com.skilldistillery.games.whiterabbit;

import com.skilldistillery.games.whiterabbit.items.GameItem;

public class GameCharacter {
	private String name;
	private int height;
	public GameCharacter(String name, int height) {
		//super();
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Your name is: ");
		builder.append(name);
		builder.append(", and your height is: ");
		builder.append(height);
		builder.append(".");
		return builder.toString();
	}
	
	public void useItem(GameItem gi) {
		gi.alterGameCharacter(null);
	}
}