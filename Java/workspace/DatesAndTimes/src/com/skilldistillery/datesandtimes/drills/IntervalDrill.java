package com.skilldistillery.datesandtimes.drills;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class IntervalDrill {

  public static void main(String[] args) {
    IntervalDrill drill = new IntervalDrill();
    drill.launch();
  }

  private void launch() {
    // Create a LocalDate representing the start date of your cohort.
    LocalDate sd = LocalDate.of(2018, 02, 26);
    // Create a LocalDate representing today.
    LocalDate t = LocalDate.now();
    // Print out both dates.
    System.out.println("Cohort start date: " + sd + "\tToday: " + t);
    // Create a Period object representing the interval between the two dates, and print it.
    Period timeInCourse = Period.between(sd, t);
    // Create a LocalTime representing when you arrived today.
    System.out.println("Period in course: " + timeInCourse.getDays());
    LocalTime arrival = LocalTime.of(8, 5);
    // Create a LocalTime representing now.
    LocalTime now = LocalTime.now();
    // Print out both times.
    System.out.println("When I got here today: " + arrival + "\tNow: " + now);
    // Create a Duration object for the interval between now and when you arrived, and print it.
    Duration timeInClass = Duration.between(arrival, now);
    // What happens if you try to create a Duration representing
    // the interval between your cohort start date and today?
    System.out.println("Seconds in class today: " + timeInClass.getSeconds());
  }

}
