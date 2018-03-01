package drills;

public class ForLoopBody2 {

	public static void main(String[] args) {
		/*
		  The for loops below have errors. Copy each loop and paste
		  below the block comment. Fix the code so that it can compile.
		 
		// Loop 1
		
		// Loop 2
		 
		// Loop 3
		 
		 */
		for (int y = 0, x = 10; x + y < 15; x++, y++) {
			System.out.println(x + y);
		}
		
		for (int a = 0, b = 4; a < 5; a++, b++) {
			System.out.println("a is " + a + ", b is " + b);
		}
	
		int 	q;
		for (q = 5; q < 10; q++) {
			System.out.println(q);
		}
		System.out.println("q is now " + q);
		
	}

}
