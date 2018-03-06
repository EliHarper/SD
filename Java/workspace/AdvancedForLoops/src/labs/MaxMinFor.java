package labs;

public class MaxMinFor {

	public static void main(String[] args) {
		int[] numbers = { 28, 33, 55, 21, 35 };
		int largest = 0;
		int smallest = 100;
		//smallest = 100 will work for this particular array.
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i]< smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: "+ smallest);
	}

}
