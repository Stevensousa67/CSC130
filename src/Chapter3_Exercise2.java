import java.util.Scanner; // import this to use Scanner

public class Chapter3_Exercise2 {
	public static void main(String[] args) {
		
		/* Write a program that converts a temperature from C to F. It should (1) prompt user for input,
		 * (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output
		 * to one decimal place. When it's finished, it should work like this:
		 * 
		 * Enter a temperature in C: 24
		 * 24.0 C = 75.2 F
		 * 
		 * Here's the formula for the conversion:
		 * 
		 * F = C * (9/5) + 32
		 * 
		 */
		
		// create scan object to get keyboard input.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a temperature in C: ");
		
		double celsius = input.nextDouble();
		double fahrenheit = celsius * 9/5 + 32;
		
		System.out.println(celsius + " C = " + fahrenheit + " F");
		
		input.close();
		
		
		
	}// end main
}// end class