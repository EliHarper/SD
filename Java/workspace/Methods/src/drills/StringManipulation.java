package drills;

public class StringManipulation {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a word or phrase: ");
		String phrase = scanner.nextLine();
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		String returnedValue = addCharacter(phrase,num);
		System.out.println(returnedValue);
		
		// 2. Call addCharacter, passing phrase and num, and assign its return
		// value to a local variable.
		
		// 3. Output the value of the local variable.
		scanner.close();
	}
	
	/*
	 * (Optional) Add third parameter String charToAdd to addCharacter.
	 * Concatenate this character instead of !
	 * In main, prompt the user for a character to add, 
	 * and pass the String to addCharacter.
	 */
	
	public static String addCharacter(String input, int numExc) {
		// 1. Declare a local variable "output". Initialize it to the parameter input..
		// Using a loop, concatenate _numExc_ "!" characters to  the local variable output.
		String output = input;
		
		int count = 0;
		while(count < numExc) {
			output = output + "!";
			count ++;
		}
		
		
		// return "output" instead of "input"
		return output;
	}

}
