package com.skilldistillery.lambdas.labs;

import java.util.List;
import java.util.function.Predicate;


public class PlanetFilteringLab {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities.getPlanets();

    printPlanets(planets);
  }
  
  private static void printPlanets(List<Planet> planets) {
    System.out.println("********PLANETS********");
    Predicate <Planet> pa = p -> p.getName().toLowerCase().contains("a");
    Predicate <Planet> py = p -> p.getName().toLowerCase().contains("y");
//    for(Planet p : planets) {
//    	if (pa.test(p)) {
//			try {
//				planets.add(p);
//			} catch (UnsupportedOperationException uoe) {
//			}
//		}
//      System.out.println(p);
      
      System.out.println(PlanetUtilities.filterPlanets(planets, pa, py));
    }

}
