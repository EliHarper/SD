package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayListExample ex = new ArrayListExample();
    ex.run();
  }

  private void run() {
    // Declare and instantiate an ArrayList to hold Strings. 
    // Use the type argument <String> in the constructor.
   ArrayList <String> list1 = new ArrayList();
    // Declare and instantiate an ArrayList to hold Double objects. 
    // This time use the <> shortcut in the constructor.
   ArrayList <Double> list2 = new ArrayList();
    
    // Try to declare an ArrayList to hold double primitives (not Double objects). What happens?
//   ArrayList <double> list3 = new ArrayList();
    // Now try declaring an ArrayList without type arguments.
//     ArrayList <> list4 = new ArrayList();
    ArrayList noType = new ArrayList();
    // What is the warning Eclipse gives you?
//    Cannot be paramaterized with arguments <>
    // What combinations of <> and <String> can you put on either side of the =, and still have the code compile?
    ArrayList <String> list5 = new ArrayList <String>();
    
  }

}
