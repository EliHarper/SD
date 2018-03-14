package com.skilldistillery.games.whiterabbit.items;

import com.skilldistillery.games.whiterabbit.GameCharacter;

public class LabeledFood extends Food {
	private String label;
	public LabeledFood(double alterationFactor, String name, String label) {
		super(alterationFactor, name);
		this.label = label;
	}

	@Override
	public void alterGameCharacter(GameCharacter gc) {
		// TODO Auto-generated method stub

	}
	
	public String getLabel() {
		return label;
	}

}
