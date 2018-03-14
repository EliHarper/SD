package com.skilldistillery.games.whiterabbit.items;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.games.whiterabbit.GameCharacter;

public class FoodFactoryImpl implements FoodFactory {
	List <Food> foodList = new ArrayList<Food>();
	
	@Override
	public Food getFood() {
		int random = (int) (Math.random()*foodList.size());
		Food f = foodList.get(random);
		if (foodList.size() > 0) {
			foodList.remove(random);
		}
		return f;
	}
	
	public FoodFactoryImpl(){
		foodList.add(new FoodImpl("cake", 1.5));
		foodList.add(new FoodImpl("cake", .75));
		foodList.add(new LabeledFood(.5, "taco", "Estoy un taco."));
		foodList.add(new LabeledFood(.2, "carrot", "EAT ME"));
		foodList.add(new LabeledFood(2, "pizza", "DON'T EAT ME!!!"));
		foodList.add(new LabeledFood(5, "muffin", "I'm a talking muffin!"));
	}
	
	

}
