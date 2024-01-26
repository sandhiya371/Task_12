package Qus234;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Create an ArrayList of strings

		ArrayList<String> qusTwo = new ArrayList<>();
		// Add some elements to the ArrayList
		qusTwo.add("Shirin");
		qusTwo.add("Sandy");
		qusTwo.add("Sam");
		qusTwo.add("Michael");
		qusTwo.add("David");

		// Print the original ArrayList
		System.out.println("Original ArrayList: " + qusTwo);

		System.out.println("The Original ArrayList Size: " + qusTwo.size());
		// Remove all elements from the ArrayList
		qusTwo.clear();

		// Print the ArrayList after removing elements
		System.out.println("ArrayList after removing all elements: " + qusTwo);

		System.out.println("The Size of ArrayList after removing all the elements: " + qusTwo.size());

	}
}


//Output:
//	Original ArrayList: [Shirin, Sandy, Sam, Michael, David]
//	The Original ArrayList Size: 5
//	ArrayList after removing all elements: []
//	The Size of ArrayList after removing all the elements: 0