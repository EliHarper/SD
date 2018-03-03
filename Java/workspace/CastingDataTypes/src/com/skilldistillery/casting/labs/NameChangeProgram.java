package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class NameChangeProgram {
	public static String name;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("What is your first name?");
		name = kb.next();
		NameChanger n = new NameChanger();
		n.calculateNumericValue(name);
		System.out.println(n.calculateNumericValue(name));
		n.transformString(name);
		System.out.println(n.transformString(name));
	}

}
