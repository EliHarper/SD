package labs;

import java.util.Scanner;

public class AverageScores {

	public static void main(String[] args) {
		//declare int array scores		assign new int array
		
		int[] scores						= new int[5];
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter "+scores.length+" scores.");
		for (int i = 0; i < scores.length; i++) {
			//prompt the user, store to the array
			int count = i+1;
//			made count so that this sysout doesn't start at score 0.
			System.out.println("Score " + count + ": ");
//			store into the array
			scores[i] = kb.nextInt();
		}
//		Call calculateAverage and pass the scores array
		calculateAverage(scores);
		System.out.println("The average of all of the scores is: "+ calculateAverage(scores));
		
	}
	
	public static double calculateAverage(int array[]) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double avg = total/array.length;
		return avg;
	}

}
//In this lab you will see how for loops and arrays work well together. It looks long, but it is manageable if you go step-by-step.
//
//Write a program to declare an array with space for five ints. Prompt a user to enter five scores by repeating the prompt Score 1:, Score 2:, etc. Store the entries in the correct array index.
//Write a method called calculateAverage to calculate and return the average of all the scores. It should take one parameter and return a number value.
//To ensure that the method for calculating scores works, we are going to write a test method.
//Write a method called public static void testCalculateAverage().
//In the method, declare and initialize an array of four ints whose average will divide evenly - no decimal place.
//Call the calculateAverage method and store the result in a variable.
//Use an if statement to check if the result is what you expected. If so, print the message Passed. If not, print the message Failed with the value that you expected and the value returned from the method.
//Call the testCalculateAverage method from main. Fix any errors in calculateAverage. Once the method works, comment out the call to testCalculateAverage.
//Now that we know calculating the average works, call the calculateAverage method in main and print the average for the user to see.