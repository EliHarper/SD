package com.skilldistillery.argsArray.labs;

public class CountTo {

	public static void main(String[] args) {
		if (args.length ==1) {
			System.out.println("Congrats, you passed exactly 1 argument. \nGoodbye.");
		}
		else {
			int count = Integer.parseInt(args[0]);
			for (int i = 0; i < args.length; i++) {
				System.out.println(i);
			}
		}
	}

}
