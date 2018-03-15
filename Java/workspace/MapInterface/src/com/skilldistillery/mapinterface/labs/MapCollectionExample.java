package com.skilldistillery.mapinterface.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapCollectionExample {

	public static void main(String[] args) {
		Map<Character, String> letterToName = new HashMap<>();

		Map<Character, Set<String>> letterToManyNames = new HashMap<>();

		try (BufferedReader in = new BufferedReader(new FileReader("names.txt"))) {

			String line = null;
			while ((line = in.readLine()) != null) {
				String name = line;
				Character firstChar = name.charAt(0);
				// if(bNames == null) {
				// bNames = new ArrayList<>();
				// letterToManyNames.put('B', bNames);
				Set<String> listOfNames = letterToManyNames.get(firstChar);

				if ((listOfNames == null)) {
					listOfNames = new HashSet<>();
					letterToManyNames.put(firstChar, listOfNames);
				}
				listOfNames.add(name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(letterToManyNames);
	}

}
