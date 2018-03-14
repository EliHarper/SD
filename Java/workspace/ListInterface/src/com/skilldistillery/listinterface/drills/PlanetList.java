package com.skilldistillery.listinterface.drills;

import java.util.List;

public class PlanetList {


public static void main(String[] args) {
    PlanetList p = new PlanetList();
    p.run();
  }

  private void run() {
    List<Planet> planets = PlanetUtilities.getPlanets();
    System.out.println(planets);
    
    // Create a new Planet object using the Planet constructor call below.
    // new Planet("Jupiter", 778_330_000, 142_984)
    
    Planet p = new Planet("Jupiter", 778_330_000, 142_984);
    
    // Print true or false for whether the List contains this planet
    
    System.out.println("The planets list contains Jupiter: " + (planets.contains(p)));
    
    // If this was not what you expected, change the Planet class to support
    // comparison to other Planets. (Hint: what method does Java use to see if
    // one Object equals another Object?)
    
    for (int i = 0; i < planets.size(); i++) {
    		if (planets.get(i).equals(p)) {
				System.out.println("Found Jupiter.");
			}
    		else {System.out.println("Not Jupiter.");}
	}
    
    int index = planets.indexOf(p);
    System.out.println("The index of Jupiter is: " + index);
    // Try to find the index of this planet in the List, and print out that index.
    System.out.println(planets.remove(p));
    // Now remove Jupiter by passing the object reference you created, and
    
    // print true or false for whether removing worked.
    
    
  }
}
