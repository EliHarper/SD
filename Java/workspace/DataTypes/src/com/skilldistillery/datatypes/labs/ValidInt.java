package com.skilldistillery.datatypes.labs;

public class ValidInt {

	public static void main(String[] args) {
		int validInt = 1;
		long longInt = validInt;
		
		System.out.println(validInt);
		System.out.println(longInt);
		
		//validInt = longInt;
		
		//Can't convert from long to int b/c of the memory discrepancy. When the int value was assigned to the long data type, the rest of the bytes at the beginning were automatically filled w/ bits as zeroes. When you assign the same value back, Java won't let you cut all of the zeroes off.
	}

}
