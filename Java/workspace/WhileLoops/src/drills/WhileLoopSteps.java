package drills;

import java.util.Scanner;

public class WhileLoopSteps {

  public static void main(String[] args) {
    // Write a `while` loop that will accept a number from the user, multiply it by
    // 2, and print the value to the screen. The program should accept data from the
    // user until the user enters zero.
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number that you would like doubled. When you are finished, enter a zero.");
    int num = sc.nextInt();

    while (num != 0) {
    		int numDoubled = num*2;
    		System.out.println(num + " x 2 is: "+ numDoubled);
    		System.out.println("Please enter another number: ");
    		num = sc.nextInt();
    }
    // while loop to multiply and get more input...
    sc.close();
  }
}
