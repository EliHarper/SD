package com.skilldistillery.advancedarrays.drills;

public class ArrayOfObjects {

	public String name;
	public static void main(String[] args) {
    PopStar ps1 = new PopStar();
    ps1.name = "RZA";
    
    PopStar ps2;
    ps2 = new PopStar();
    ps2.name = "GZA";
    
    PopStar ps3 = new PopStar();
    ps3.name = "Ghostface Killa";
    // Instantiate an Array to hold PopStar objects.
    PopStar[] wtc = new PopStar[3];
    
    wtc[0] = ps1;
    wtc[1] = ps2;
    wtc[2] = ps3;
    
    // Create PopStar instances and add them to the array.
 
    // Call the method allSing, passing your array.
    allSing(wtc);
    
  }
  
  public static void allSing(PopStar[] stars) {
    // Loop through the array and call each PopStar's sing() method.
	  
  }

}
