public class Chapter1_Exercise3 {
	public static void main(String[] args) {
		
		/**	Starting with the Hello World program, try out each of the following errors.
			After you make each change, compile the program, read the error message (if
			there is one), and then fix the error. 
		 */
		
		System.out.println("Hello World");
		
		/**	1) Remove one of the opening curly braces
		 * 	A: Error: Syntax error on token ")", { expected after this token.
		 * 
		 * 	2) Remove one the closing curly braces.
		 * 	A: Syntax error, insert "}" to compile ClassBody
		 * 
		 * 	3) Instead of main, write mian 
		 * 	A: Error: Main method not found in class Chapter1_Exercise3, please define the main method as:
		 * 		public static void main(String[] args)
		 * 	   or a JavaFX application class must extend javafx.application.Application.
		 * 
		 * 	4) Remove the word static
		 * 	A: Error: Main method is not static in class Chapter1_Exercise3, please define the main method as:
		 * 	   public static void main(String [] args)
		 * 
		 * 	5) Remove the word public
		 * 	A:  Error: Main method not found in class Chapter1_Exercise3, please define the main method as:
		 * 		public static void main(String[] args)
		 * 	   or a JavaFX application class must extend javafx.application.Application.
		 * 
		 * 	6) Remove the word System
		 * 	A: Exception in thread "main" java.lang.Error: Unresolved compilation problem: out cannot be resolved.
		 * 
		 * 	7) Replace println with Println
		 * 	A: Exception in thread "main" java.lang.Error: Unresolved compilation problem: the method Println(String) 
		 * 	   is undefined for the type PrintStream
		 * 
		 * 	8) Replace println with print
		 * 	A: Prints multiple prints into one line
		 * 
		 * 	9) Delete one parenthesis
		 * 	A: Exception in thread "main" java.lang.Error: Unresolved compilation problem: Syntax error,
		 * 	   insert ")" to compile Expression
		 * 
		 * 	10) Add an extra parenthesis
		 * 	A: Exception in thread "main" java.lang.Error: Unresolved compilation problem: Syntax error
		 * 	   on token ")", delete this token.
		 * 
		 */

	}// end main
}// end class
