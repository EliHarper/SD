package com.skilldistillery.polymorphism.drills.employee;

public class DatabaseAdmin extends Employee {

  public DatabaseAdmin() {
    super();
  }

  public DatabaseAdmin(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  public void executeJob(String data) {
	  String output = createTables(data);
	  System.out.println(output);
  }
  
  // DatabaseAdmin behavior...
  public String createTables(String tableName) {
    return "Created table " + tableName;
  }
  
}
