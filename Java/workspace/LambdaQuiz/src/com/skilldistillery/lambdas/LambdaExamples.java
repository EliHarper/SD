package com.skilldistillery.lambdas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
	/*
	 * Create static fields for each definition below based on the functional interface, method, and functionality.
	 * Interface : method : functionality
	 * Note that functionality may define the type of a parameterized interface.
	 */
	 
	
	/*
	 * Runnable : void run() : System.out.println("Running")
	 */
	static Runnable r1 = () -> {System.out.println("Running"); };
	static Runnable r2 = () -> System.out.println("Running"); 
	
	/*
	 * java.util.concurrent.Callable<V> : V call() : return the current year as an Integer
	 */
	static Callable <Integer> c1 = () -> Integer.valueOf(LocalDate.now().getYear());
	
	/*
	 * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters 
	 */
	static Comparator <Planet> d1 = (o1, o2) -> o1.getDiameter() > o2.getDiameter() ? 1 : -1;

	/*
	 * Predicate<T> : boolean test(T o1) : return true if Planet name contains "u" 
	 */
	static Predicate <Planet> u1 = o1 -> o1.getName().contains("u");

	/*
	 * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name contains the given String, case-insensitive
	 */
	static BiPredicate <Planet, String> t1 = (t, s) ->  t.getName().contains(s);

	/*
	 * Function<T, R> : R apply(T t) : return the President's name in the format "Lastname, Firstname"
	 */
	static Function <President, String> p1 = p -> p.getLastName() + ", " + p.getFirstName();
		
	/*
	 * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a President's first and last name with a sequential number starting with U u, and return the transformed name String.
	 * For example u = 0, President name "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
	 */
	static BiFunction <President, Integer, String> bf = (p, i) -> {
		
		String firstLast = p.getFirstName() + " " + p.getLastName();
//		static BiFunction<President, Integer, String> f2 = (p, i) -> {
//	        String fnln = p.getFirstName() + " " + p.getLastName();
//	        
//	        int count = 0;
//	        for (int j = 0; j < fnln.length(); j++) {
//	            fnln = fnln.replaceFirst("[AEIOUaeiou]", String.valueOf(count));
//	            count++;
//	        }
//
//	        return fnln;
//	    };
		
		for (int j = 0; j < firstLast.length(); j++) {
			firstLast = firstLast.replaceFirst("[AEIOUaeiou]", String.valueOf(i));
			i++;
		}
		
		return firstLast;
	};
	
	public static void main(String[] args) {
		LambdaExamples le = new LambdaExamples();
		President p = new President(0, "Abradolf", null, "Lincler", 0, "", "");
		String name = LambdaExamples.bf.apply(p, 0);
		System.out.println(name);
	}
}
