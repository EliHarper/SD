package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class AddingAndGetting {

  public static void main(String[] args) {
    AddingAndGetting ag = new AddingAndGetting();
    ag.run();
  }
  
  private void run() {
    ArrayList<String> strings = new ArrayList<>();
    
    // Output the list's size.
    System.out.println("The list has " + strings.size() + " places.");
    // Add first names of several of your classmates.
   strings.add("Rebecca");
   strings.add("Alex");
   strings.add("Nate");
   strings.add("Miranda");
    // Output the list's size again.
    
   System.out.println("The list has " + strings.size() + " places now.\n");
    // Use a for loop and get(index) to iterate through the list and print each name in uppercase letters.
   for (int i = 0; i < strings.size(); i++) {
	   System.out.println(strings.get(i).toUpperCase());
	
}
    outputLastItem(strings);  // Stretch goal: Finish the method below.
     
  }
  
  private void outputLastItem(ArrayList<String> list) {
    // Finish this method to output the last item in the list in lowercase.
	  System.out.println(list.get(list.size() - 1).toUpperCase());
//	  for (int i = 0; i < list.size(); i++) {
//		if (i == (list.size() -1)) {
//			System.out.println();
//			System.out.println(list.get(i).toLowerCase());
		}
  }

