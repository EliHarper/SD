package drills;

public class WhileLoop {

  public static void main(String[] args) {

    printNumbers();

    mathRandomWhile();

  }

  public static void printNumbers() {
    // Write a while loop to print the numbers 1 to 10 to the screen.
	  int num = 1;
	  while (num<=10) {
		  System.out.println(num);
		  num += 1;
	  }
  }

  public static void mathRandomWhile() {
    // Use Math.random() to write a while loop that will execute as long as a random
    // number is less than 0.7. Print the number inside the loop.
    // Example: double d = Math.random();
    // Make sure to reassign d with a new Math.random() value in the loop body.
    // After the loop, add a statement to print the final value of d.
	  double d = Math.random();
	  while (d< 0.7) {
		  System.out.println("d = " + d);
		  d = Math.random();
	  }
	  System.out.println("The final value of d is: " + d);
  }

}
