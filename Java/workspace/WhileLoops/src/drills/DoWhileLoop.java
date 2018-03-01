package drills;

public class DoWhileLoop {

  public static void main(String[] args) {
    // Write a do-while loop to print the numbers 1 to 10 to the screen.
	  int num = 1;
	  do {
		  System.out.println(num);
		  num += 1;
	  } while (num < 11);
	  
    // Use Math.random() to write a do-while loop that will execute as long as a
    // random number is less than 0.7. Print the number inside the loop.
    // Declare a variable outside the loop, and assign a new Math.random() value in
    // the loop body. Then print the number to the screen.
    // Example: double d = Math.random();
	 double d = 0.1; 
	  do {
		  System.out.println("d = "+ d);
		  d = Math.random();
	  } while (d< 0.7);
	  System.out.println("The final value for d is: " + d);
  }
}
