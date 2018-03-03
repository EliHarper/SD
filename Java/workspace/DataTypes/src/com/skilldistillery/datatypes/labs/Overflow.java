package com.skilldistillery.datatypes.labs;

public class Overflow {

	public static void main(String[] args) {
		int big = 2_147_483_647;
		int bigger = big+1;
		
		System.out.println(big);
		System.out.println(bigger);
		
		//Okay. This is because the value of big is the exact end of the positive range of an int; around 2B. When you add one, the binary value of the number moves to the first bit in the byte, making the int bigger the most negative value of an int data type.
		
	}

}
