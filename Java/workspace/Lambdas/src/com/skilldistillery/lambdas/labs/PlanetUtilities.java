package com.skilldistillery.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PlanetUtilities {
  public static List<Planet> getPlanets() {
    return Arrays.asList(
        new Planet("Mercury", 57_910_000, 4_880),
        new Planet("Venus", 108_200_000, 12_103),
        new Planet("Earth", 149_600_000, 12_756),
        new Planet("Mars", 227_940_000, 6_794),
        new Planet("Jupiter", 778_330_000, 142_984),
        new Planet("Saturn", 1_429_400_000, 120_536),
        new Planet("Uranus", 2_870_990_000L, 51_118),
        new Planet("Neptune", 4_504_000_000L, 49_532));
  }

  public static List<Planet> filterPlanets(List<Planet> list, Predicate<Planet> ps) {
    List<Planet> tempList = new ArrayList<>(list);
//    Predicate<String> startsWithComment = p -> p.trim().startsWith("//");
//    boolean removed = strings.removeIf(startsWithComment);
    boolean removed = tempList.removeIf(ps.negate());
    System.out.println(removed);
    for (Planet planet : list) {
      System.out.println(planet);
    }
    System.out.println(tempList.toString());
    return tempList;
  }
  public static List<Planet> filterPlanets(List<Planet> list, Predicate<Planet> pa, Predicate<Planet> py) {
	  List<Planet> tempList = new ArrayList<>(list);
	  System.out.println(tempList);
//    Predicate<String> startsWithComment = p -> p.trim().startsWith("//");
//    boolean removed = strings.removeIf(startsWithComment);
	  boolean removedA = tempList.removeIf(pa);
	  boolean removedY = tempList.removeIf(py);
	  System.out.println("A's removed: " + removedA);
	  System.out.println("Y's removed: " + removedY);
	  
	  System.out.println(tempList.toString());
	  return tempList;
  }
}
