package com.skilldistillery.datatypes.drills;

public class DeclaringPrimitives {

  public static void main(String[] args) {
    // Declare a byte variable and assign the value 128. What happens? Assign it a valid value.
    byte b = 127;
    // Create a switch statement for your variable.
    // Have a case for each of the values 127, -128, 0, 'A', 128, '\u0000'.
    // Which values cause compiler errors?
    switch (b) {
	case 127:
		System.out.println("You're playing with fire you hot sack of garbage");
		break;
		
	case -128:
		System.out.println("Somebody knows the range of a byte now...");
		break;
	
	case 0:
		System.out.println("Okay, that works for me.");
		break;
		
	case 'A':
		System.out.println("Aaaaand by that you mean 65.");
		break;
	
//	case '\u0000':
//		System.out.println("Mr. Fancy Pants char wants to make two cases for 0.");
	
	default:
		break;
	}
    
    // Declare a int variable and assign it a value.
    int x = 15;
    // Again create a switch statement.
    // Have a case for each of the values 127, -128, 'A', 128, '\u0000'.
    switch (x) {
	case 127:
		
		break;
	case -128:
		
		break;
	case 'A':
		
		break;
	case 128:
		
		break;
	case '\u0000':
		
		break;

	default:
		break;
	}
  }

}
