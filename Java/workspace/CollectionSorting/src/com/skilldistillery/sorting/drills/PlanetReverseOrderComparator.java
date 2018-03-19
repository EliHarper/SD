package com.skilldistillery.sorting.drills;

import java.util.Collections;
import java.util.Comparator;

public class PlanetReverseOrderComparator implements Comparator <Planet> {
	public int compare(Planet o1, Planet o2) {
		if (o1.getOrbit() < o2.getOrbit()) {
			return 1;
		}
		else if (o1.getOrbit()>o2.getOrbit()) {
			return -1;
		}
		
		return 0;
	
	}
}
