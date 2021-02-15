import java.util.Random;
import java.util.Scanner;

public class Chapter3_Exercise4 {
	public static void main(String[] args) {
		
		/* The goal of this exercise is to program a Guess My Number game. When it's finished, it should
		 * work like this:
		 * 
		 * I'm thinking of a number between 1 and 100
		 * (including both). Can you guess what it is?
		 * Type a number: 45
		 * Your guess is: 45
		 * The number I was thinking of is 14
		 * You were off by: 31
		 * 
		 * To choose a random number, you can use the Random class in java.util.Random.
		 * 
		 * 1) The definition of GuessStarter is in a file called GuessStarter.java, in the 
		 * directory called ch03, in the repository for this book.
		 * 
		 * 2) Compile and run this program.
		 *
		 */

        // pick a random number
        //Random random = new Random();
        //int number = random.nextInt(100) + 1;
        //System.out.println(number);
 
		 /* 3) Modify the program to prompt the user; then use a Scanner to read a line of user input.
		  * Compile and run the program.
		  * 
		  */
        
		Random random = new Random();
		Scanner input = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        
        /* 4) Read the user input as an integer and display the result. Again, compile and test.
         * 
         */
        
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        int user_number = input.nextInt();
        System.out.println("Your guess is: " + user_number);
        
       
        /* 5) Compute and display the difference between the user's guess and the number that was generated.
         * 
         */
        
        int difference = number - user_number;
        
        // in case random number is smaller than user number, the difference won't be negative.
        if (difference < 0) {
        	difference = difference * -1;
        }// end if

        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + difference);
        
        
		
	}// end class
}// end class