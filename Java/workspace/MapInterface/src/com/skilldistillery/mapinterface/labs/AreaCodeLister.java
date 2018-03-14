package com.skilldistillery.mapinterface.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AreaCodeLister {
  private Map<String, String> areaCodes;
  private Map<String, String> abbreviations;

  public AreaCodeLister() {
    populateAreaCodes();
    populateAbbreviations();
    print();
  }

  private void populateAreaCodes() {
    areaCodes = new TreeMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "areacodes.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {
        String codeAsString = line.split("\t")[0];
        String stateAbbrev = line.split("\t")[1];
        areaCodes.put(stateAbbrev, codeAsString);
        
        // Add code to parse out the area code and abbreviation
        // from each line. Then add them to the areaCodes Map.
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void populateAbbreviations() {
    abbreviations = new HashMap<>();

    try (BufferedReader in = new BufferedReader(new FileReader(
        "abbreviations.txt"))) {

      String line = null;
      while ((line = in.readLine()) != null) {
        String stateName = line.split("\t")[0];
        String stateAbbrev = line.split("\t")[1];
        abbreviations.put(stateAbbrev, stateName);
        // Add code to parse out the state and abbreviation
        // from each line. Then add them to the abbreviations
        // Map.
      }
    }
    catch (IOException e) {
      System.err.println(e);
      System.exit(1);
    }
  }

  private void print() {
    // Add code to display the area code and the full state name
    // associated with it.
	  Set<String> s = areaCodes.keySet();
	  Iterator<String> it = s.iterator();
	  
	  while (it.hasNext()) {
		String key = it.next();
		System.out.println("Area code: " + areaCodes.get(key) + " \tState name: " + abbreviations.get(key));
	}
	//Use data from one map to get data from another map
  }

  public static void main(String[] args) {
    new AreaCodeLister();
  }
}