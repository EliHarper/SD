package com.skilldistillery.games.whiterabbit.io;

public class Text implements Drawable {
	private String output;
	
	public Text(String output) {
		this.output = output;
	}

	@Override
	public void draw() {
		System.out.println(output);
	}

}
