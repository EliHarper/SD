package com.skilldistillery.polymorphism.drills.employee;

public class EmployeePrintingApp {

  public static void main(String[] args) {
    EmployeePrintingApp epa = new EmployeePrintingApp();
    
    epa.run();

  }
  
  private void run() {
    // Create an array of type Employee with space for 3 Employees
    Employee empArray[] = new Employee[3];
    // Create a DataAnalyst, SoftwareDeveloper, and DatabaseAdmin
    // using the multi-arg constructors for each, and assign each to the array.
    DataAnalyst da = new DataAnalyst("TOP SECRET", "Bob", "Dataman", 44, "Data 1", 86000);
    SoftwareDeveloper sd = new SoftwareDeveloper("Richie", "Turner", 22, "SDevII", 61000);
    DatabaseAdmin admin = new DatabaseAdmin("Mona", "Dataperson", 33, "DBA", 100000);
    empArray [0] = da;
    empArray [1] = sd;
    empArray[2] = admin;
    // Call processEmployees and pass the Employee array reference.
    processEmployees(empArray);
  }
  
  public void printEmployeeNameAndTitle(Employee e) {
		System.out.print(e.firstName + " - " + e.getTitle());
		System.out.println();
  }
  // Add a method printEmployeeNameAndTitle that takes an Employee and prints
  // name - title
  // to the screen.
  
  public void processEmployees(Employee[] employees) {
    // loop through the Employee array and call printEmployeeNameAndTitle
    // for each Employee
	  for (int i = 0; i < employees.length; i++) {
		  Employee employee = employees[i];
		  printEmployeeNameAndTitle(employee);
	  }
  }

}
