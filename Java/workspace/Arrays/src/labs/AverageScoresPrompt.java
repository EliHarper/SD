package labs;

import java.util.Scanner;

public class AverageScoresPrompt {

	public static void main(String[] args) {
		//declare int array scores		assign new int array
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many scores would you like to enter?");
		int numScores = kb.nextInt();
		
		
		int[] scores						= new int[numScores];
		
		
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
		
		findLargest(scores);
		System.out.println("The largest number in the array is: " + findLargest(scores));
		calculateAverage(scores);
		System.out.println("The average of all of the scores is: "+ calculateAverage(scores));
		kb.close();
	}
	
	public static double calculateAverage(int array[]) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double avg = total/array.length;
		return avg;
	}
	
	public static double findLargest(int array[]) {
		double largest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>largest) {
				largest = array[i];
			}
		}
		return largest;
		
	}
}
