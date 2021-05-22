import java.util.*;

public class Homework_17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = scan.nextInt();
		System.out.println("Integer is: " + integer);		
		System.out.println("Sum of digits iteratively: " + sumOfDigits(integer));
		System.out.println("Sum of digits recursively: " + sumOfDigitsRecursive(integer));	
	}

	private static int sumOfDigits(int number) {
		
		int sum = 0;
		
		// Make number positive, if it's negative.
		if(number < 0)
			number = number * -1;
		
		while(number != 0) {
		// While loop will add the last digit of number to sum and then divide number by 10.	
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}
	
	private static int sumOfDigitsRecursive(int number) {
		
		int sum = 0;
		
		// Make number positive, if it is negative.
		if(number < 0)
			number = number * -1;
		
		if(number == 0) // base case
			return 0;
		else {
			// sum will be last digit of number + wherever recursion is at.
			sum = number%10 + sumOfDigitsRecursive(number/10);
		}
		return sum;
	}
}