package com.skilldistillery.declaration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeclarationApp {

	public static void main(String[] args) {
		String fileName = "declaration.txt";
		
		try {
			  FileReader fr = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(fr);
			  String line;
			  int lineCount = 0;
//			  String regex = "";
//				Pattern p = Pattern.compile(regex);
//				Matcher m = p.matcher("");
			  int wordCount = 0;
			  while ( (line = br.readLine()) != null) {
				
				wordCount += line.split("\\w+[A-z]").length;
			    lineCount++;
			  }
			  System.out.println("Number of words: " + wordCount);
			  System.out.println("Number of lines: " + lineCount);
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
