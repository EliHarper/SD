import java.util.Scanner;

public class RunAdder {
  public static void main(String[] args) {
    
    double total = 0.0;
    
    System.out.print("How many segments did you run? ");
    
    Scanner kb = new Scanner(System.in);
    
    int segments = kb.nextInt();
    
    
    
    for( int i = 0 ; i < segments ; i = i + 1 ) {
      System.out.print("Enter a segment value: ");
      double value = kb.nextDouble();
      total = total + value;
    }
    
    System.out.println("Are you a skunk?");
    String isSkunk = kb.next();
    
    if (isSkunk.equalsIgnoreCase("yes") ||
    		isSkunk.equalsIgnoreCase("y") ||
    		isSkunk.equalsIgnoreCase("sure") ||
    		isSkunk.equalsIgnoreCase("yeah") ||
    		isSkunk.equalsIgnoreCase("k") ||
    		isSkunk.equalsIgnoreCase("maybe") ||
    		isSkunk.equalsIgnoreCase("ya") ||
    		isSkunk.equalsIgnoreCase("yea") ||
    		isSkunk.equalsIgnoreCase("absolutely")) {
    	
	    	double sk = convertToSk(total);
	    	System.out.println("You ran " + total + " miles.");
	    	System.out.println("HOWEVER - you probably only want to know that you ran " + sk + " skunks.");
    }
    
    else {
	    System.out.println("You ran " + total + " miles.");
	    double km = convertToKm(total);
	    System.out.println(km + " kilometers.");
    }
  }
  
  public static double convertToKm(double miles) {
    double km = miles * 1.61;
    return km;
  }
  
  public static double convertToSk(double miles) {
	  double sk = miles * 422;
	  return sk;
  }
}