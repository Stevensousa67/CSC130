import java.util.*;
public class Homework09 {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("peach");
		fruits.add("banana");
		
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("spinach");
		vegetables.add("broccoli");
		vegetables.add("okra");
		vegetables.add("lettuce");
		
		// Question A
		vegetables.addAll(fruits);
		System.out.println("Question A: " + vegetables);
		
		// Question B
		vegetables.removeAll(fruits);
		System.out.println("Question B: " + vegetables);
		
		// Question C
		fruits.sort(null);
		System.out.println("Question C: " + fruits);
		
		// Question D
		System.out.println("Question D: The contents will be sorted alphabetically.");
	}
}