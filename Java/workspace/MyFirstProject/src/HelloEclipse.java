import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		System.out.println("Hello, Eclipse!");
		System.out.print("Enter your name: ");
		Scanner input;
		input = new Scanner (System.in);
		String name = input.nextLine();
		System.out.println("Hello, "+ name+"!");
		input.close();
	}
}
