// Steven Sousa - Homework 6 - 3/6/21

import java.util.*;

public class Homework06 {	
	public static void main(String[] args) {
		
		System.out.println("Question 1:");
		int[] array = new int[] {1, 2, 3, 4}; // Create array with 4 elements
		System.out.println("Sum of elements in array: " + sum_array(array));
		System.out.println();
		
		System.out.println("Question 2:");
		List<Integer> list = new ArrayList<Integer>();	// Create empty list
		list.add(10);	// Add 10 to list
		list.add(2);	// Add 2 to list
		list.add(18);	// Add 18 to list
		list.add(0);	// Add 0 to list
		System.out.println("Sum of elements in list: " + sum_list(list));
		System.out.println();
		
		System.out.println("Question 3:");
		int add_this_value = 5;
		insert(add_this_value, array);
		System.out.println();
		
		System.out.println("Question 4: ");
		System.out.println("Answer: Use list.add(index, element) function.");		
	}
	
	public static int sum_array(int[] a) {
		
		int sum = 0;	// initiate sum variable at 0
		for(int i = 0; i < a.length; i++) {		// i < a.length avoids out of bounds.
			sum = sum + a[i];	// add each value of array to sum variable
		}
		return sum;				// return sum
	}
	
	public static int sum_list(List<Integer> l) {
		
		int sum = 0;	// Initialize variable that will hold the sum of elements from list l
		for(int i = 0; i < l.size(); i++) {	// iterate over each element of list l
			sum = sum + l.get(i);	// add each element from list l to sum
		}
		return sum;					// return sum
	}
	
	public static void insert(int x, int[]a) {
		
		int[] b = new int[4]; // Start new array with 4 spaces.
		b[0] = x;			  // Set first index to element x
		for(int i = 1; i < a.length; i++) {	// iterate over array a starting at index 1
			b[i] = a[i-1];	// insert value of index - 1 from array a into array b
		}
		System.out.println("Before change: " + Arrays.toString(a));
		System.out.println("After change: " + Arrays.toString(b));
	}
}
