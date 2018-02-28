package labs;

import java.util.Scanner;

public class NextLargestMultiple {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please give me two integers. Integer 1: ");
		int i = keyboard.nextInt();
		System.out.print("Integer 2: ");
		int j = keyboard.nextInt();
		
		int NextMultiple = i + j - i % j;
		
		System.out.println("The next largest even multiple of the first integer that the second one fits into is: " + NextMultiple);
		
	}

}
