// Qus:1 EmployeeTest.java in com.example.hrtest package
package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee("Sandhiya", 89562, 65000.00);
		Employee employee1 = new Employee("Shirin", 89563, 55056.00);
		Employee employee2 = new Employee("Sandy", 89564, 56467.00);

		// Accessing methods from the Employee class

		employee.printName();
		employee.printSalary();

		System.out.println(" ");

		employee1.printName();
		employee1.printSalary();

		System.out.println(" ");

		employee2.printName();
		employee2.printSalary();

	}
}

//Output:
//	
//Employee Name: Sandhiya
//Employee Salary: 65000.0
// 
//Employee Name: Shirin
//Employee Salary: 55056.0
// 
//Employee Name: Sandy
//Employee Salary: 56467.0