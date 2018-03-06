package labs;

public class MinMaxWhile {

	public static void main(String[] args) {
		int[] numbers = { 28, 33, 55, 21, 35 };
		int largest = 0;
		int smallest = 100;
		int count = 0;
		//smallest = 100 will work for this particular array.
		while (count < numbers.length) {
			
			if (numbers[count] > largest) {
				largest = numbers[count];
			}
			if (numbers[count]< smallest) {
				smallest = numbers[count];
			}
			count++;
		}
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: "+ smallest);
	}
}