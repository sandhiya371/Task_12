//Qus: 1 / Employee.java in com.example.hr package
package com.example.hr;

public class Employee {
	public String name;
	public int id;
	public double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void printName() {
		System.out.println("Employee Name: " + name);
	}

	public void printSalary() {
		System.out.println("Employee Salary: " + salary);
	}
}