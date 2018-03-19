package com.skilldistillery.enums.drills;

public class DayDrills {

  // Create a method called printDay that takes a Day argument and 
  // prints it to the screen with System.out.println.
  private void printDay(Day day) {
	  System.out.println(day + " " + day.ordinal());
	  switch (day) {
	case FRIDAY: case SATURDAY: case SUNDAY:
		System.out.println(" ... Weekend!");
		break;
		
	}
  }
  
  // If the day is FRIDAY, SATURDAY, or SUNDAY, print the message
  // "Weekend!"
  
  private void run() {
    // call printDay with several Day values.
	  this.printDay(Day.MONDAY);
	  this.printDay(Day.FRIDAY);
	  this.printDay(Day.SUNDAY);
	  this.printDay(Day.WEDNESDAY);
	  
	  
  }
  
  public static void main(String[] args) {
    DayDrills d = new DayDrills();
    d.run();
  }

}
