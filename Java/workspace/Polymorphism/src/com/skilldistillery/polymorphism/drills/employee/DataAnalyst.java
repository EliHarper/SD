package com.skilldistillery.polymorphism.drills.employee;

public class DataAnalyst extends Employee {
  private String securityClearance;
  
  public DataAnalyst() {
  }
  
  public DataAnalyst(String securityClearance, String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
    this.setSalary(salary);
  }

  public String getSecurityClearance() {
    return securityClearance;
  }

  public void setSecurityClearance(String securityClearance) {
    this.securityClearance = securityClearance;
  }
  
  public String getInfo() {
    return super.getInfo() + " " + securityClearance;
  }
  
  public void executeJob(String data) {
	  String output = analyzeData(data);
	  System.out.println(output);
  }
  
  // DataAnalyst behavior...
  public String analyzeData(String data) {
    return data != null ? data.toUpperCase() : "Data is null";
  }
}
