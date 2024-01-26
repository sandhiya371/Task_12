package Qus234;

import java.util.TreeMap;

public class EmployeeMap {
	public static void main(String[] args) {
		// Create a TreeMap with employee IDs and names
		TreeMap<Integer, String> employee = new TreeMap<>();

		// Add employee information to the TreeMap
		employee.put(3864, "Arun");
		employee.put(3865, "Bharath");
		employee.put(3866, "Chaithanya");
		employee.put(3867, "Dhanya");
		employee.put(3868, "Gopal");

		// Print names of employees in alphabetical order
		System.out.println("Names of Employees in Alphabetical Order:");

		for (String name : employee.values()) {
			System.out.println(name);
		}
	}
}

// 	Output:
//	
//	Names of Employees in Alphabetical Order:
//	Arun
//	Bharath
//	Chaithanya
//	Dhanya
//	Gopal
//	
