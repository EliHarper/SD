package com.skilldistillery.enums.drills;

public class DayMethods {

  public static void main(String[] args) {
    // Iterate through the Day constants, printing each Day name.
	  Day[] days = Day.values();
	  for (int i = 0; i < days.length; i++) {
		Day day = days[i];
		if (day.toString().toLowerCase().contains("r")) {
			System.out.println(day + " " + "*");
		}
		else {
			System.out.println(day);
		}
	}
    // If the name contains the letter R, add a "*" next to it.
  }

}
