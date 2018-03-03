package com.skilldistillery.numeralsystems.labs;

public class PrintNumbers {

	public static void main(String[] args) {
		int k = 10;
		printNumbers(k);
	}

	private static void printNumbers(int k) {
		for(int i=0; i<k; i++) {
			System.out.printf("decimal: %08d  %n\thexadecimal: 0x%08x %n\toctal: 0%08o %n\tbinary: 0b", i, i, i);
			System.out.println(Integer.toBinaryString(i));
		}
	}
	
}
