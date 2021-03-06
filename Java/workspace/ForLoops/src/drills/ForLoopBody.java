package drills;

public class ForLoopBody {

	public static void main(String[] args) {
		//Write a for loop to print the numbers 10 to 1 to the screen.
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//Write a for loop to find the sum of the values 1 to 10. Print the sum to the screen.
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total = i + total;
		}
		System.out.println(total);
		
		//Write a for loop to print the values 1 to 5. Output should be comma-separated: 1, 2, 3, 4, 5.
		//Hint: the loop will need to check which iteration it is on to prevent a comma showing after 5.
		System.out.println();
		for (int i = 1; i<6; i++) {
			if (i<5) {
				System.out.print(i + ", ");
			}
			else {
				System.out.println(i);
			}
		}	
	}

}
