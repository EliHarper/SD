package labs;

import java.util.Scanner;

public class MinMaxPrompt {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] numbers = { 28, 33, 55, 21, 35 };
		for (int i= 0; i<numbers.length;i++) {
			System.out.println("Please enter another int for the array");
			numbers[i] = kb.nextInt();
		}
		
		int largest = numbers [0];
		int smallest = numbers [0];
		
		for (int i : numbers) {
			if (i>largest) {
				largest = i;
			}
			if (i < smallest) {
				smallest = i;
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: "+ smallest);
	}

}

