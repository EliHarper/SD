
public class ScannerInput {

	public static void BirthYear(){
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("Please enter the year you were born: ");
		System.out.println();
		// add a prompt...

		int yearBorn = keyboard.nextInt();

		// output the data...
		System.out.println();
		System.out.println("You were born in " + yearBorn);
	}
	public static void main(String[] args) {
		// Add a prompt to the code so that the user knows to enter data. Output the data.
		boolean continueOrNah;

		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		BirthYear();
		// Run the program.

		System.out.println("Do you want to continue? Enter true or false.");
		continueOrNah = keyboard.nextBoolean();

		if (continueOrNah == true){
			System.out.println("Fine.");
			BirthYear();
			System.out.println("Do you want to continue? Enter true or false. This time I won't even do anything if you say true. I'm done.");
			continueOrNah = keyboard.nextBoolean();
			if (continueOrNah == true){
				System.out.println("I said I'm done!");
			}
			else{
				System.out.println("Good, I'm done playing anyway.");
			}
		}

		else if (continueOrNah != true){
			System.out.println("Good, I'm done playing anyway.");
		}

		keyboard.close();
	}

}
