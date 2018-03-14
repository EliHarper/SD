package com.skilldistillery.mapinterface.drills;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {

  public static void main(String[] args) {
    UsingHashMap uhm = new UsingHashMap();
    uhm.launch();
  }

  private void launch() {
    // Declare and instantiate a map to hold Integer--->String key-value pairs
    Map <Integer, String> presidents = new HashMap<>();
    // Put these pairs in the map
     presidents.put(1, "George Washington");
     presidents.put(16, "Abraham Lincoln");
     presidents.put(32, "Franklin D. Roosevelt");
     presidents.put(36, "Lyndon B. Johnson");
     presidents.put(44, "Barack Obama");
     
    // 16 Abraham Lincoln
    // 32 Franklin D. Roosevelt
    // 36 Lyndon B. Johnson
    // 44 Barack Obama
    
    // Get the value for key 16 and output the key and value to the screen
    System.out.println("16, " + presidents.get(16));
    // Get the value for key 37 and output the key and value to the screen
    System.out.println("37, "+ presidents.get(37));
    System.out.println("36, " + presidents.get(36));
    System.out.println("************************");
    // Get the value for key 36 and output the key and value to the screen.
    
    // Iterate through the Map and output the key-value pairs in the format
    // key[tab][tab]value
    Set <Integer> s = presidents.keySet();
    Iterator <Integer> it = s.iterator();
    
    while (it.hasNext()) {
		Integer integer = it.next();
		System.out.println("Key: " + integer+ "\tValue: " + presidents.get(integer));
	}
    
  }

}
