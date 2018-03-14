package com.skilldistillery.setinterface.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "names.txt";
		Set<String> nameSet = new TreeSet<>();
		List<Set<String>> finalDataSet = new ArrayList<>();
		int count = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				nameSet.add(line);
				count++;

			}
			

			System.out.println(finalDataSet);
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());
			return;
		} catch (IOException e) {
			System.err.println("Problem while reading " + fileName + ": " + e.getMessage());
			return;
		}
		System.out.println("Size of set: " + nameSet.size());
		System.out.println("Number of lines: " + count);
	}

}
