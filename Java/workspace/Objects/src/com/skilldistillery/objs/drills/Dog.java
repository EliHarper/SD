package com.skilldistillery.objs.drills;

public class Dog {
  public String breed;
  public String name;
  public int weight;
  
  // Add a constructor with parameters to initialize breed and weight.
  public Dog(String b, int w) {
	  breed = b;
	  weight = w;
  }
  // Add a constructor with parameters to initialize name, breed, and weight.
  public Dog(String n, String b, int w) {
	  breed = b;
	  name = n;
	  weight = w;
  }
  
  public void displayDogInfo() {
    System.out.println("Dog [breed = " + breed + ", name = " + name + ", weight = " + weight + "]");
  }

  public static void main(String[] args) {
    // Create three dog instances and call the displayDogInfo method on each Dog object.
	  Dog fred = new Dog ("Fred", "German Shepherd", 100);
	  Dog someDog = new Dog ("Bishon", 25);
	  Dog third = new Dog ("Woofer", "Bulldog", 50);
	  fred.displayDogInfo();
	  someDog.displayDogInfo();
	  third.displayDogInfo();
  }

}
