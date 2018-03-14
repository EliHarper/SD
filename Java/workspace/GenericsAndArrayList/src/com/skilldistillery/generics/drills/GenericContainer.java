package com.skilldistillery.generics.drills;

import java.util.ArrayList;

import com.skilldistillery.generics.solutions.Container;

public class GenericContainer {

  public static void main(String[] args) {
	Container container = new Container();
	GenericContainer gc = new GenericContainer();
    // Declare and instantiate a Container to hold a Character object.
    Character c = container.set('A');
    // Call the object's set method and pass in 'A'.
    gc.printChar(c);
    // get the Character from the object and pass it to printChar.
    
    // Try to set an Integer or String into the object.
    ArrayList<Integer> intList = new ArrayList<>();
    // Create an ArrayList to hold Integer objects.
    ArrayList<Container <Character> > containerList = new ArrayList<>();
    // Optional: can you create an ArrayList to hold Container<Character> objects?
    
  }
  
  private static void printChar(Character c) {
    System.out.println("The character is " +  c);
  }
  
  public class Containter <Character>{
	  
  }

}
