package drills;

public class SphereWithColorTest {

  public static void main(String[] args) {
	  
	  
	  SphereWithColor sp1;
	  sp1 = new SphereWithColor();
	  sp1.radius = 12;
	  sp1.color = "red";
	  sp1.displaySphere();
	  
	  SphereWithColor sp2;
	  sp2 = new SphereWithColor();
	  sp2.radius = 13;
	  sp2.color = "green";
	  sp2.displaySphere();

	  SphereWithColor sp3;
	  sp3 = new SphereWithColor();
	  sp3.color = "blue";
	  sp3.radius = 14;
	  sp3.displaySphere();
	  
	  SphereWithColor fake;
	  fake = new SphereWithColor();
	  fake.displaySphere();
    // Create several SphereWithColor reference variables
    // and new objects.
	  

    // Initialize each object's color and radius fields.

    // Call displaySphere for each object.

    // Create another SphereWithColor, but do not initialize its fields.
    // Call its displaySphere method. What values do you see?
	  
  }

}
