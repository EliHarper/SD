package com.skilldistillery.games.whiterabbit.io;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.games.whiterabbit.GameCharacter;
import com.skilldistillery.games.whiterabbit.Obstacle;
import com.skilldistillery.games.whiterabbit.items.Food;
import com.skilldistillery.games.whiterabbit.items.FoodFactory;
import com.skilldistillery.games.whiterabbit.items.FoodFactoryImpl;
import com.skilldistillery.games.whiterabbit.items.Labelable;
import com.skilldistillery.games.whiterabbit.items.LabeledFood;

public class GameApp {
	IOManager iom = new SystemIOManager();
	private FoodFactory foodFactory;
	private IOManager ioManager;

	private GameApp() {
		iom.init();
	}

	private Drawable bd(String s) {
		return new Text(s);
	}

	private void launch() {

		FoodFactoryImpl ffi = new FoodFactoryImpl();

		Obstacle o = new Obstacle("door", 10, "SMALL");

		Drawable d = new Text("What is your name?");
		String name = iom.getUserInput(d);

		GameCharacter gc = new GameCharacter(name, 15);

		while (true) {
			menu();

			String theInput = iom.getUserInput(new Text("What would you like to do?"));

			boolean timeToLeave = false;

			switch (theInput) {
			case "1":
				examineSurroundings(gc, o);
				break;

				
			case "2":
				findHelp(ffi, gc, o);
				break;
				
			case "3":
				boolean iWin = move(gc, o);
				timeToLeave = true;

				if (iWin) {
					iom.print(new Text("You did it!"));
				}
				else {
					iom.print(new Text("Your height is: " + gc.getHeight() + " but the obstacle is: " + o.getHeight()));
				}
				break;
				
			case "4":
				timeToLeave = true;
				break;
				
			default:
				break;
				
			}
			if (timeToLeave == true) {
				break;
			}
		}

	}

	private void examineSurroundings(GameCharacter gc, Obstacle o) {
		iom.print(new Text(gc.toString() + " and you're in a field."));
		iom.print(new Text("You see a " + o.getName() + " and it is " + o.getHeight() + " high."));

	}

	private void findHelp(FoodFactoryImpl ffi, GameCharacter gc, Obstacle o) {
		// get some food and have a menu to decide what to do
		Food food = ffi.getFood();
		
		iom.print(new Text("You see a " + food.getName()));
		secondMenu();
		boolean exit = false;

		while(exit == false) {
			
			String theInput2 = iom.getUserInput(new Text("What would you like to do?"));
			switch (theInput2) {
			case "1":
				if (food != null) {
					examineFood(food);
				}
				secondMenu();
				break;
				
			case "2":
	
				iom.print(bd("You decide to try the " + food.getName()));
				
				if (food.getAlterationFactor() > 1) {
					iom.print(bd("You grow bigger!"));
				}
				else {
					iom.print(bd("You shrink!"));
				}
	
				int newHeight = (int) (gc.getHeight() * food.getAlterationFactor());
				if (newHeight < 1) {
					newHeight = 1;
				}
				iom.print(bd("Your height is now " + (newHeight)));
				gc.setHeight(newHeight);
				
				exit = true;
				break;
	
			case "3":
				iom.print(bd("So be it. Say goodbye to the food."));
				
				exit = true;
				break;
	
			default:
				break;
			}
		}
	}

	private void examineFood(Food food) {

		iom.print(new Text("You see a " + food.getName()));
		if (food instanceof LabeledFood) {
			String label = ((LabeledFood) food).getLabel();
			iom.print(new Text("It says " + label));
		}
	}

	private boolean move(GameCharacter gc, Obstacle o) {
		boolean result = false;
		if ("BIG".equals(o.getType())) {

			if (gc.getHeight() >= o.getHeight()) {
				// I win!
				result = true;
			}
			else {
				result = false;
			}
		}
		else {
			if (gc.getHeight() <= o.getHeight()) {
				// I win!
				result = true;
			}
			else {
				result = false;
			}

		}
		return result;
	}

	private void menu() {
		iom.init();
		List<Drawable> menuOptions = new ArrayList<>();
		menuOptions.add(new Text("1. Examine your surroundings"));
		menuOptions.add(new Text("2. Look around for help"));
		menuOptions.add(new Text("3. Move"));
		menuOptions.add(new Text("4. Quit"));
		iom.print(menuOptions);
	}

	private void secondMenu() {
		iom.init();
		List<Drawable> secondMenuOptions = new ArrayList<>();
		secondMenuOptions.add(new Text("1. Examine it"));
		secondMenuOptions.add(new Text("2. Eat it"));
		secondMenuOptions.add(new Text("3. Ignore it"));
		iom.print(secondMenuOptions);
	}

	private void shutdown() {
		iom.destroy();
	}

	public static void main(String[] args) {
		GameApp ga = new GameApp();
		ga.launch();

		ga.shutdown();
	}

}
