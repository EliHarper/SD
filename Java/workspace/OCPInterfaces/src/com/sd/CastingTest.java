package com.sd;

public class CastingTest {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		CastingTest ct = new CastingTest();
		
		String s = "q";
		Comparable c = s; //Works because String implements Comparable
		
		System.out.println(s.toLowerCase());
		// Try using the Comparable reference to call c.toLowerCase().
//		System.out.println((c).toLowerCase());
		//c.toLowerCase() without a cast won't compile because the compiler
		//just looks to the c - sees Comparable, and thinks that the only
		//method it has is .compareTo()
		//sort of like how the Animal b = new Bird()
		//needed a cast -> ((Bird)b).fly()
		
		// Will the line below compile?
		// Comparable maybe = ct;
		
		// Will the line below compile?
		// Will it execute without any issues?
		// Comparable comp = (Comparable) ct;
	}
}
