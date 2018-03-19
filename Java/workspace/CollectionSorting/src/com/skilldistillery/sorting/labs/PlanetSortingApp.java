package com.skilldistillery.sorting.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlanetSortingApp implements Comparator<Planet> {

  public static void main(String[] args) {
    PlanetSortingApp app = new PlanetSortingApp();
    app.launch();
  }

  private void launch() {
    List<Planet> planets = new ArrayList<Planet>();
    
    planets.add(new Planet("Earth", 149_600_000, 12_756));
    planets.add(new Planet("Jupiter", 778_330_000, 142_984));
    planets.add(new Planet("Mars", 227_940_000, 6_794));
    planets.add(new Planet("Mercury", 57_910_000, 4_880));
    planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));
    planets.add(new Planet("Saturn", 1_429_400_000, 120_536));
    planets.add(new Planet("Uranus", 2_870_990_000L, 51_118));
    planets.add(new Planet("Venus", 108_200_000, 12_103));
    
//    PlanetReverseOrderComparator proc = new PlanetReverseOrderComparator();
//    Collections.sort(planets, proc);
//    planets.sort(proc);
    Collections.sort(planets);
    
    printPlanets(planets);
    
  }
  
  private void printPlanets(Collection<Planet> planets) {
	 
//	  System.out.println("Planets listed in reverse order using a comparator: \n");
    System.out.println("Planets liseted after sorting itself using Collections.sort;");
	  for (Planet planet : planets) {
      System.out.println(planet);
    }
  }

@Override
public int compare(Planet o1, Planet o2) {
	// TODO Auto-generated method stub
	return 0;
}

}
