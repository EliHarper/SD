package com.skilldistillery.projects.romannumerals;

import java.util.Scanner;

public class RomanNumeralTranslatorImpl {

	public static void main(String[] args) {
		RomanNumeralTranslatorImpl romanTrans = new RomanNumeralTranslatorImpl();
		romanTrans.translateWord();
	}

	public void translateWord() {
		Scanner kb = new Scanner(System.in);
		while (true) {
			StringBuilder sb = new StringBuilder();
			
			System.out.println("What number would you like to see in Roman Numerals? Type a non-integer to exit.");
			String numToTranslate = kb.next();
			int parsedNum = 0;
			try {
				parsedNum = Integer.parseInt(numToTranslate);
			} catch (NumberFormatException nfe) {
				System.out.println(numToTranslate);
				System.exit(0);
			}
	
			if (parsedNum >= 90) {
				
				if(parsedNum >= 500_000 && parsedNum < 1_000_000) {
					sb.append("D̅");
					
					parsedNum = parsedNum - 500_000;
					numToTranslate = String.valueOf(parsedNum);
				}
				
				if(parsedNum >= 100_000 && parsedNum < 500_000) {
					int weirdDTimes = parsedNum / 100_000;
					for (int i = 0; i < weirdDTimes; i++) {
						sb.append("C̅");
					}
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
				}
					
					
				if(parsedNum >= 50000 && parsedNum < 100_000) {
					sb.append("L_");
					
					parsedNum = parsedNum - 50000;
					numToTranslate = String.valueOf(parsedNum);
				}
				
				if(parsedNum >= 10000 && parsedNum < 50000) {
					int weirdXTimes = parsedNum / 10000;
					for (int i = 0; i < weirdXTimes; i++) {
						sb.append("x̄");
					}
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
				}
				
				if(parsedNum >= 5000 && parsedNum < 10000) {
					sb.append("v̅");
					parsedNum = parsedNum - 5000;
					numToTranslate = String.valueOf(parsedNum);
				}
				
				if(parsedNum >= 1000 && parsedNum < 5000) {
					int mTimes = parsedNum / 1000;
					for (int i = 0; i < mTimes; i++) {
						sb.append("M");
					}
					
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
					
				}
				
				if (parsedNum >=900 && parsedNum < 1000) {
					sb.append("CM");
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
				}
				
				if(parsedNum >= 500 && parsedNum < 900) {
					sb.append("D");
					parsedNum = parsedNum - 500;
					numToTranslate = String.valueOf(parsedNum);
				}
				
				if (parsedNum >= 400 && parsedNum < 500) {
					sb.append("CD");
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
				}
				
				if (parsedNum >= 100 && parsedNum < 400) {
					int cTimes = parsedNum / 100;
					for (int i = 0; i < cTimes; i++) {
						sb.append("C");
					}
					
					numToTranslate = numToTranslate.substring(1);
					parsedNum = Integer.parseInt(numToTranslate);
					
				}
				else if (parsedNum >= 90 && parsedNum < 100) {
					sb.append("XC");
				}
			}
			
			if (numToTranslate.length() == 2) {
				if (parsedNum < 90 && parsedNum >= 50) {
					sb.append("L");
					parsedNum = parsedNum - 50;
				}
				
				else if (parsedNum >= 40 && parsedNum < 50) {
					sb.append("XL");
				}
				
				if (parsedNum < 40) {
					int xTimes = parsedNum / 10;
					for (int i = 0; i < xTimes; i++) {
						sb.append("X");
					}
					// parsedNum = parsedNum - (xTimes * 10);
				}
			}
			if (numToTranslate.endsWith("9")) {
				sb.append("IX");
			}
			else
				if (numToTranslate.endsWith("8")) {
					sb.append("VIII");
				}
				else
					if (numToTranslate.endsWith("7")) {
						sb.append("VII");
					}
					else
						if (numToTranslate.endsWith("6")) {
							sb.append("VI");
						}
						else
							if (numToTranslate.endsWith("5")) {
								sb.append("V");
							}
							else
								if (numToTranslate.endsWith("4")) {
									sb.append("IV");
								}
								else
									if (numToTranslate.endsWith("3")) {
										sb.append("III");
									}
									else
										if (numToTranslate.endsWith("2")) {
											sb.append("II");
										}
										else
											if (numToTranslate.endsWith("1")) {
												sb.append("I");
											}
	
			System.out.println(sb.toString());
		}
	}

}
