package com.skilldistillery.inheritance.drills;

public class DataAnalyst extends Employee {
	
	private String securityClearance;
	
	public DataAnalyst(String sc, String firstName, String lastName, int age, 
			String title, double salary) {
			super(firstName, lastName, age, title, salary);
//			this.securityClearance = sc;
//			this.title = title;
//			this.salary = salary;
//			setTitle(title);
//			setSalary(salary);
//			this.age = age;
//			this.firstName = firstName;
//			this.lastName = lastName;
		}
	
	public String getInfo() {
		return super.getInfo() + securityClearance;
	}
}
