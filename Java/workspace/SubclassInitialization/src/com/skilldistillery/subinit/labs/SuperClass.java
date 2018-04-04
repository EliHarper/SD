package com.skilldistillery.subinit.labs;

public class SuperClass {
	static String superStatic = singString("superStatic declaration");
	String superInstance = singString("superInstance declaration");
	
	static {
		singString("TOP");
	}
	
	public SuperClass(){
		System.out.println("SuperClass()");
	}
	
	public static String getSuperStatic() {
		return superStatic;
	}
	public static void setSuperStatic(String superStatic) {
		SuperClass.superStatic = superStatic;
	}
	public String getSuperInstance() {
		return superInstance;
	}
	public void setSuperInstance(String superInstance) {
		this.superInstance = superInstance;
	}
	
	public static String singString(String s) {
		System.out.println(s);
		return s;
	}
	static {
		singString("BOTTOM");
	}
}
