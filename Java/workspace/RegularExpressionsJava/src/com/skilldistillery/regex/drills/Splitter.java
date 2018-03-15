package com.skilldistillery.regex.drills;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Splitter {
  public static void main(String[] args) {
    Splitter s = new Splitter();
    List<Pet> pets = s.parseFile("pets.txt");
    for (Pet pet : pets) {
      System.out.println(pet);
    }
  }

  private List<Pet> parseFile(String fileName) {
    List<Pet> pets = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line = br.readLine(); // Read and discard header line
      ArrayList <Pet> petList = new ArrayList<>();
      //id,  name  color breed age gender  comments
      while ((line = br.readLine()) != null) {
    	  	
    	  	String[] petData = line.split(",?\\t");
    	  	Integer id = Integer.parseInt(petData[0]);
    	  	String name = petData[1];
    	  	String color = petData[2];
    	  	String breed = petData[3];
    	  	Integer age = Integer.parseInt(petData[4]);
    	  	String gender = petData[5];
    	  	String comments = petData[6];
    	  	
    	  	Pet newPet = new Pet(id.intValue(), name, color, breed, age.intValue(), gender, comments);
    	  	petList.add(newPet);
        // Split each line into fields,
        // use the fields to construct a Pet object and add it to the pets list
        // Fields are separated by a tab that's optionally preceded by a comma.
    	  
      }
      System.out.println(petList.toString());
      br.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return pets;
  }

}
