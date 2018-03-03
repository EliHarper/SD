package com.skilldistillery.casting.labs;

public class NameChanger {
	public static int sum;
	public int calculateNumericValue(String name) {
		char nameArray[] = name.toCharArray();
		sum = 0;
		for (int i = 0; i < nameArray.length; i++) {
			sum = sum + nameArray[i];
		}
		return sum;
	}

	public String transformString(String name) {
		char nameArray[] = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = (char) (nameArray[i]+3);
			//			How to revert back to characters?
		}
		String newNameStr = String.valueOf(nameArray);
		return newNameStr;
	}
}
