package drills;

public class ForEachBreakContinue {

  public static void main(String[] args) {
    // Write a foreach loop to display only odd numbers.
    // Output: 55 105 99 71 39 43
	  
    int[] odds = new int[] { 55, 72, -12, 105, 99, 71, -100, 39, 43 };

    for (int i : odds) {
		if (i%2 ==1) {
			System.out.print(i + " ");
		}
		if (i == -100) {
			break;
		}
	}
    // Change the loop to break if -100 is found.
    // Output: 55 105 99 71

  }

}
