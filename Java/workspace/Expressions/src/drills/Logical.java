package drills;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min, max, salary;
		
		System.out.println("Let's see if the salary you've been offered is what you expected.");
		System.out.print("Enter your minimum salary requirement: ");
		min = sc.nextInt();
		System.out.print("Enter the maximum you would ask for: ");
		max = sc.nextInt();
		System.out.print("Enter the salary offered: ");
		salary = sc.nextInt();
		
		boolean isExpectedSalary = false;
//		boolean laughable = false;
//		boolean dreamy = false;
		
		if (salary >=min && salary <=max) {
			isExpectedSalary = true;
		}
		
		// Add code to check if the salary is in the range of min and max and assign that 
		// value to isExpectedSalary
		
		System.out.println("Is this salary what you expect for the position? " + isExpectedSalary);
		
		Dreamy(salary, max);
		Laughable(salary, max);
		
//		if (salary > max + 10000) {
//			dreamy = true;
//		}
//		
//		if (salary < min -5000) {
//			laughable = true;
//		}
//		
//		System.out.println("Is the salary dreamy? " + dreamy);
//		
//		System.out.println("Is the salary laughable? "+ laughable);
		
		
		
		// Add code to check and output whether the salary is "dreamy," where dreamy means it is
		// more than $10,000 greater than your max.
		
		// Add code to check and output whether the salary is "laughable," where laughable means it is
		// at least $5,000 less than your minimum salary requirement.
		
		sc.close();
	}
	
	public static void Dreamy(int salary, int max) {
		if (salary > max + 10000) {
			System.out.println("That is one dreamy salary..");
		}
	}
	public static void Laughable(int salary,int max) {
		if (salary <= max - 5000) {
			System.out.println("Ha. No. That's laughable.");
		}		
	}
	
}
