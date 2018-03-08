package com.skilldistillery.caesarcipher;

import java.util.Scanner;

public class CaesarCipherApp {

	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		CaesarCipherApp app = new CaesarCipherApp();
		app.run();
		
	}
	public void run() {
		CaesarCipher cipher = new CaesarCipher();
		
		System.out.println("Would you like to encrypt or decrypt a message?");
		String input = kb.nextLine();
		
		System.out.println("What is the message?");
		String message = kb.nextLine();
		
		if (input.equalsIgnoreCase("encrypt")) {
			System.out.println("How much would you like to shift the characters by?");
			int shift = kb.nextInt();
			cipher.encrypt(message, shift);
			System.out.println(cipher.encrypt(message, shift));
		}
		
		else if (input.equalsIgnoreCase("decrypt")) {
			System.out.println("How much would you like to shift the characters by?");
			int shift = kb.nextInt();
			cipher.decrypt(message, shift);
			System.out.println(cipher.decrypt(message, shift));
		}
		
	}
}
