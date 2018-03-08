package com.skilldistillery.inheritance.drills;

public class EmployeeApp {

  public static void main(String[] args) {
    EmployeeApp app = new EmployeeApp();
    app.run();
  }
  
  private void run() {
    Person pers = null;
    // Create a Person object and assign it to pers. Give the person a firstName,
    // lastName, and age using either the constructor or setters.
    pers = new Person("Ronnie", "Dobbs", 35);
    // Call getInfo() and print the Person's information to the screen.
    String persInfo = pers.getInfo();
    System.out.println(persInfo);
    
    Employee emp2 = null;
    emp2 = new Employee("Big Wave", "Dave", 45, "Professor", 74_000);
    System.out.println(emp2.getInfo());
    // Create an Employee object using the five-argument constructor, and 
    // assign it to emp2.
    
    
    // Call getInfo() and print the Employee's information to the screen.
    DataAnalyst da = new DataAnalyst("TOP SECRET", "Bob", "Belcher", 45, "Black Ops Spy", 100000);
    System.out.println(da.getInfo());
  }

}
