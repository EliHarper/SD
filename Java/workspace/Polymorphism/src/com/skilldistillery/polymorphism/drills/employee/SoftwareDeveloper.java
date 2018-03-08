package com.skilldistillery.polymorphism.drills.employee;

public class SoftwareDeveloper extends Employee {

  public SoftwareDeveloper() {
    super();
  }

  public SoftwareDeveloper(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // Software developer behavior...
  public String produceSoftware() {
    return "Hello World!";
  }
  
  public void executeJob(String data) {
	  String output = produceSoftware();
	  System.out.println(output);
  }
  
  public String getInfo() {
    return super.getInfo();
  }
  
}
