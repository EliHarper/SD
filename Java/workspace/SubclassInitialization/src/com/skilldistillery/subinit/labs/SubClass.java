package com.skilldistillery.subinit.labs;

public class SubClass extends SuperClass {

	static String staticField = singString("staticField declaration");
	{
		singString("ABOVE");
	}
	String instanceField = singString("instanceField declaration");
	
	public SubClass() {
		super();
		System.out.println("My constructor");
		
		instanceField = singString("Set by my constructor");
	
	}

}
