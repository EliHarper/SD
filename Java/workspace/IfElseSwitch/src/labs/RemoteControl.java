package labs;

import java.util.Scanner;

public class RemoteControl {
	static Scanner keyboard = new Scanner(System.in);
	static String button;
	public static void main(String[] args) {
		System.out.println(
				"Hello and welcome to this beautiful remote control simulator. \nWhat button would you like to press?");
		button = keyboard.next();
		
		switch(button)
		{
			case "0":
			case "1":
			case "2":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				pressButton();
				break;
			case "ON":
				TurningOn();
				break;
			case "OFF":
				TurningOff();
				break;
			default:
				System.out.println("Command not recognized.");
		}
		}

		/*if (button.equals("1") || button.equals("2") || button.equals("3") || button.equals("4") || button.equals("5")
				|| button.equals("6") || button.equals("7") || button.equals("8") || button.equals("9")) {
			pressButton();
		}

		else if (button.equalsIgnoreCase("ON")) {
			TurningOn();
		} 
		else if (button.equalsIgnoreCase("OFF")) {
			TurningOff();
		}

			else {
				System.out.println("Command not recognized.");
			}
	}

	public static void pressButton() {
		System.out.println("BOOOOOOP!");
	}


	}*/
	
	public static void pressButton() {
		System.out.println("BOOOOP!!!");
	}
	public static void TurningOn() {
		System.out.println("TURNING ON...");
	}
	public static void TurningOff() {
		System.out.println("TURNING OFF...");
	}

}
