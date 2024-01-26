package Qus234;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		// Create a List of strings
		List<String> qusThree = new ArrayList<>();
		qusThree.add("Arya Stark");
		qusThree.add("Dori");
		qusThree.add("Nemo");
		qusThree.add("Jon Snow");

		// Convert List to Array
		String[] stringArray = qusThree.toArray(new String[0]);

		// Print the original List
		System.out.println("Original List: " + qusThree);

		// Print the converted Array
		System.out.println("Converted Array: ");
		for (String element : stringArray) {
			System.out.println(element);
		}
		
	}
}

//
//Output:

//Original List: [Arya Stark, Dori, Nemo, Jon Snow] 

//Converted Array:
//  	Arya Stark 
//  	Dori 
//  	Nemo 
//  	Jon Snow

