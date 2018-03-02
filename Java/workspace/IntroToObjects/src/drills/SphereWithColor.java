package drills;

public class SphereWithColor {
  public double radius;
  public String color;
  // Add a String field for color.

  public double getVolume() {
    double vol = 4.0 / 3.0 * 3.14159 * radius * radius * radius;
    return vol;
  }
  
  public void displaySphere() {
	  System.out.println("The object's radius is: " + radius);
	  System.out.println("The object's color is: " + color);
	  System.out.println("The object's volume is: " + getVolume());
  }

  // Add a method called displaySphere.
  // return type: void
  // parameters: none
  // functionality: Prints the object's radius, color, and volume to the screen.

}
