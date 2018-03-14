package com.skilldistillery.generics.labs;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		ArrayList <Double> ranDoubles = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ranDoubles.add(Math.random());
		}
		
		for (int i = 0; i < ranDoubles.size(); i++) {
			System.out.printf("%.3f", ranDoubles.get(i));
			System.out.println();
		}
	}

}
