package com.skilldistillery.caesarcipher;

public class CaesarCipher {

	public String encrypt(String text, int shift) {
		String result = "";
		if (text == null) {
			return null;
		}
		if (shift>26) {
			shift = shift%26;
		}
		char[] messageArray = text.toCharArray();
		
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] >= 65 && messageArray[i] <= 90) {
				if (messageArray[i]+shift > 90) {
					int numOver = (messageArray[i]+shift) - 90;
					messageArray[i] = (char) (numOver + 64);
				}
				else {
					messageArray[i] = (char) (messageArray[i] + shift);
				}
			}

			else if (messageArray[i] >= 97 && messageArray[i] <= 122) {
					
				if (messageArray[i]+ shift > 122) {
					int numOver = (messageArray[i] + shift)- 122;
					messageArray[i] = (char) (numOver + 96);
				}
				else {
					messageArray[i] = (char) (messageArray[i] + shift);
				}
			}
		}
		
		
		
		for (int j = 0; j < messageArray.length; j++) {
			result = result + messageArray[j];
		}
		return result;
	}

		public String decrypt(String text, int shift) {
			String result = "";
			if (text == null) {
				return null;
			}
			if (shift>26) {
				shift = shift%26;
			}
			char[] messageArray = text.toCharArray();
			
			for (int i = 0; i < messageArray.length; i++) {
				if (messageArray[i] >= 65 && messageArray[i] <= 90) {
					if (messageArray[i]-shift < 65) {
						int numUnder = (messageArray[i]-shift) +90;
						messageArray[i] = (char) (numUnder - 64);
					}
					else {
						messageArray[i] = (char) (messageArray[i] - shift);
					}
				}
				
				else if (messageArray[i] >= 97 && messageArray[i] <= 122) {
					
					if (messageArray[i] - shift < 97) {
						int numUnder = (messageArray[i] - shift)+122;
						messageArray[i] = (char) (numUnder-96);
					}
					else {
						messageArray[i] = (char) (messageArray[i] - shift);
					}
				}
			}
			
			for (int j = 0; j < messageArray.length; j++) {
				result = result + messageArray[j];
			}
			return result;
		}
		// Decryption logic here


	private char encryptChar(char toEncrypt, int shift) {
		char encrypted = '\u0000';
		return encrypted;
	}

	private char decryptChar(char toDecrypt, int shift) {
		char decrypted = '\u0000';
		return decrypted;
	}

}
