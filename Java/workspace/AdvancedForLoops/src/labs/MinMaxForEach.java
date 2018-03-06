package labs;

public class MinMaxForEach {

	public static void main(String[] args) {
		int[] numbers = { 28, 33, 55, 21, 35 };
		int largest = 0;
		int smallest = 100;
		//smallest = 100 will work for this particular array.
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
