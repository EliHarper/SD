package drills;

public class SphereCreation {

  public static void main(String[] args) {

	  // Create three Sphere "objects."
	  // 1. A baseball, radius 3.7
	  // 2. A basketball, radius 12.0
	  // 3. Mercury, radius 244 million centimeters
	  //    Try writing this as 244_000_000.0 or 244e5
	  
	  
	  // Print each object's volume to the screen using System.out.println.
	
	Sphere baseball = new Sphere();
	baseball.radius = 3.7; 				//(-3.7--    )
    Sphere basketball = new Sphere();
    basketball.radius = 12.0;			//(-12.0------            )
    Sphere mercury = new Sphere();
    mercury.radius = 244e5;				//( Bigger than I care to represent )
    		//Can also be written as 244_000_000
    // create a Sphere object
    // get the object's volume
    
    System.out.println(baseball.getVolume());
    System.out.println(basketball.getVolume());
    System.out.println(mercury.getVolume());
    
    // print the radius using this object's data
  }
}
