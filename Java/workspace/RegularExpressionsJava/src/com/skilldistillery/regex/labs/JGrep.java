package com.skilldistillery.regex.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {

	public static void main(String[] args) {
		String regex = "";
		String fileName = "";
		String thirdArg = "";
		boolean caseInsensitive = false;
		
		if (args.length > 0) {
			regex = args [0];
			fileName = args [1];
			if (args.length > 2) {
				thirdArg = args [2];
				if (thirdArg.equals("-i")) {
					caseInsensitive = true;
				}
			}
		}
		
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = null;
			while ((line = br.readLine()) != null) {
				m.reset(line);
				
				if (m.find()) {
					String output = line;
					
					System.out.println((m.start()) + "["+  line + "]");
				}
				
			}
				// See if the regex matches the line.

				// If so, print the line

			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
