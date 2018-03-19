package com.skilldistillery.datesandtimes.drills;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeDrill {

  public static void main(String[] args) {
    // Create a LocalDate and a LocalTime representing the current
    // date and time.
   System.out.println(LocalDate.now());
    // Print both out.
   LocalTime t = LocalTime.now();
    System.out.println(t);
    // Use the LocalTime above to create a LocalTime for 90 minutes in the future, and print it out.
    LocalTime t2 = t.plusMinutes(90);
    // What happens if you use your original LocalTime to create a LocalTime for 22 hours in the future?
    System.out.println("Time plus 90 min: " + t2);
    
    LocalTime t3 = t.plusHours(22);
    
    System.out.println("Time plus 22 hrs: " + t3);
    //There is no tomorrow in the LocalTime.now()
    
  }

}
