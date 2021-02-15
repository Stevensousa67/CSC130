// import Scanner library for seconds input
import java.util.Scanner;

public class Chapter3_Exercise3 {
	public static void main(String[] args) {
		
		/* Write a program that converts a total number of seconds to hours, minutes, and seconds.
		 * It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate
		 * the result, and (4) use printf to display the output. For example, "5000 seconds = 1 hours, 
		 * 23 minutes, and 20 seconds. 
		 * 
		 * Hint: Use the remainder operator. 
		 * 
		 */
		
		// create input method
		Scanner input = new Scanner(System.in);
		
		// Ask user for seconds
		System.out.println("Enter how many seconds you want to convert to hour, minute, and seconds: ");
		
		// Declare variables
		int seconds = input.nextInt();
		int hour = seconds / 60;
		int minute = hour % 60;
		int converted_seconds = seconds % 60;
		
		hour = hour / 60;
		
		
		// I couldn't figure out how to properly use the %d in the printf statement for each variables.
		// Would really appreciate some enlightenment, professor. Thank you!
		System.out.printf(seconds + " seconds =  " + hour + " hours, " + minute + " minutes, and " + converted_seconds + " seconds.");
		
		input.close();
		
		
	}// end main
}// end class