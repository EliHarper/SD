package com.skilldistillery.subinit.labs;

public class InitializationDemo extends SuperClass {

//	In InitializationDemo, after the SubClass object is instantiated, use their getters to print the resulting values of its own and its superclass's static and instance fields.

	public InitializationDemo() {
	}

	public static void main(String[] args) {
		System.out.println("Start");
		SuperClass sc = new SubClass();
		System.out.println(sc.getSuperStatic());
		System.out.println(sc.getSuperInstance());
		System.out.println("End");
	}

}
