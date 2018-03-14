package com.skilldistillery.io.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PlanetReader {

  public static void main(String[] args) {
    String fileName = "planets.txt";
    PlanetReader pr = new PlanetReader();
    List<Planet>planetList = pr.readPlanets(fileName);
    System.out.println(planetList);
  }

  private List<Planet> readPlanets(String fileName) {
    // Add code here to:
    // Open the file
    // Read it line by line, printing just the planet name.
    // Close the file.
	  
	  try {
		  FileReader fr = new FileReader(fileName);
		  BufferedReader br = new BufferedReader(fr);
		  String line;
		  List<Planet> planets = new ArrayList<>();
		  while ( (line = br.readLine()) != null) {
			   String name = line.split(", ")[0];
			   String orbit = line.split(", ")[1];
			   long orbitLong = Long.parseLong(orbit);
			   String diameter = line.split(", ")[2];
			   int diameterInt = Integer.parseInt(diameter);
			   Planet planet = new Planet (name, orbitLong, diameterInt);
			   planets.add(planet);
		  }
		  br.close();
		  return planets;
		}
		catch (FileNotFoundException e) {
		  System.err.println("Invalid filename: " + e.getMessage());
		  return null;
		}
		catch (IOException e) {
		  System.err.println("Problem while reading "+fileName+": "+e.getMessage());
		  return null;
		}
  }
  
  void writePlanets(String fileName, List<Planet> planets){
	  try {
		  FileOutputStream fs = new FileOutputStream("test.txt");
		  PrintStream ps = new PrintStream(fs);
		}
		catch (FileNotFoundException e) {
		  e.printStackTrace();
		}
	  
	  FileWriter fw;
	  List<Planet> data = planets;
	  try {
	    fw = new FileWriter("newPlanet.txt");
	    PrintWriter pw = new PrintWriter(fw);
	    for (Planet p : data) {
	      pw.println(p);
	    }
	    pw.close();
	  }
	  catch (IOException e) {
	    e.printStackTrace();
	  }
	}
}
  
