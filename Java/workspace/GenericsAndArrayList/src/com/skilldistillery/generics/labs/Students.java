package com.skilldistillery.generics.labs;

import java.util.ArrayList;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ArrayList <String> studentNames = new ArrayList();
		studentNames.add("Nate");
		studentNames.add("Xian");
		studentNames.add("Julian");
		studentNames.add("Grace");
		studentNames.add("Andrew");
		studentNames.add("Dora");
		studentNames.add("Miranda");
		studentNames.add("Alan");
		studentNames.add("Drew");
		studentNames.add("Mark");
		studentNames.add("Sven");
		studentNames.add("Megan");
		studentNames.add("Rebecca");
		studentNames.add("Alex");
		
		int count = 0;
		for (String string : studentNames) {
			System.out.println(studentNames.get(count));
			count++;
		}

	}

}
