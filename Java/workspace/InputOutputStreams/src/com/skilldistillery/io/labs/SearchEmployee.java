package com.skilldistillery.io.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {

	public static void main(String[] args) {
		SearchEmployee searcher = new SearchEmployee();
		searcher.search("manager");
	}

	private void search(String string) {
		String fileName = "employee.txt";
		try {
			  FileReader fr = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(fr);
			  String line;
			  while ( (line = br.readLine()) != null) {
				  if (line.contains("manager")) {
					  System.out.println(line);
				}
			  }
			  br.close();
			}
			catch (FileNotFoundException e) {
			  System.err.println("Invalid filename: " + e.getMessage());
			  return;
			}
			catch (IOException e) {
			  System.err.println("Problem while reading "+fileName+": "+e.getMessage());
			  return;
			}
	}

}
