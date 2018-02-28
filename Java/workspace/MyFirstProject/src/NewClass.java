import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//XXX make a sexy comment
		System.out.print("Type all of the things: ");
		String s = input.nextLine();
		if (s.length()>0) {
			System.out.println("You said, \"" + s + "\". ");
			
		} 
		
		else {
			System.out.println("Whatever.");
		}
		input.close();
	}
}
