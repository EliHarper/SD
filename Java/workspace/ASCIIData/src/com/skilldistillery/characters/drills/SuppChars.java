package com.skilldistillery.characters.drills;

public class SuppChars {

  public static void main(String[] args) {
    // Write the String "\uD83C\uDCA1" to the screen.
    
    // Add the statement System.out.println(Character.toChars(0x1f0a1));
    
    // Use Character.toChars() to output the code points 0x1F600 through 0x1F64F
    // Add a newline every 16 characters.
	  System.out.println("\uD83C\uDCA3");
	  
	  System.out.println(Character.toChars(0x1f0a1));
	  System.out.println(Character.toChars(0x1F600));
	  System.out.println(Character.toChars(0x1F64F));
	  int codePoint = 0x1F600;
	  for( ; codePoint <= 0x1F64F; codePoint++) {
		  System.out.print(Character.toChars(codePoint));
		  if (codePoint % 16 ==0) {
			  System.out.println();
		  }
	  }

  }

}
