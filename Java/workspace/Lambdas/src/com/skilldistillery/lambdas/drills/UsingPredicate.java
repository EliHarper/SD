package com.skilldistillery.lambdas.drills;

import java.util.function.Predicate;

public class UsingPredicate {

  public static void main(String[] args) {
    // Declare and define a Predicate<String> that tests whether
    // an input String ends with "!!"
    Predicate<String> p1 = (s) -> s.endsWith("!!");
    // Declare and define a Predicate<String> that tests whether
    // an input String is all uppercase.
    Predicate<String> p2 = s -> s.toUpperCase().equals(s);
    // Test your two Predicates by calling their test methods with some Strings.
    
    Predicate<Integer> p3 = i -> i == 42;
    
    System.out.println(p1.test("Hello!"));
    System.out.println(p1.test("Hello!!"));
    System.out.println(p2.test("hello"));
    System.out.println(p2.test("HELLO"));
    System.out.println(p3.test(41));
    System.out.println(p3.test(42));
  }

}
