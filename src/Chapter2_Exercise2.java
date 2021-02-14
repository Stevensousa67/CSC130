public class Chapter2_Exercise2 {
	public static void main(String[] args) {
		
		/* 1) Create a new program called Date.java. Copy or type in something like the Hello World program
		 *    and make sure you can compile and run it.
		 *    
		 */
		
		System.out.println("Exercise 2.2");
		
		/* 2) Write a program that creates variables named day, date, month, and year. 
		 * The variable day will contain the day of the week (like Friday), and date 
		 * will contain the day of the month (like the 13th). Assign values to those variables 
		 * that represent today's date.
		 * 
		 */
		
		String day = "Saturday";
		int date = 13;
		String month = "February";
		int year = 2021;
		
		/* 3) Display the value of each variable on a line by itself. This is an intermediate step that is
		 * useful for checking that everything is working so far. Compile and run before moving on.
		 * 
		 */
		
		//System.out.println("Day of the week: " + day);
		//System.out.println("Date: " + date);
		//System.out.println("Month: " + month);
		//System.out.println("Year: " + year);
		
		
		/* 4) Modify the program so that it displays the date in standard American format
		 * (Saturday, February 2, 2021)
		 */
		
		//System.out.print("American format: " + day + ", " + month + " " + date + ", " + year);
		
		/* 5) Modify the program so it also displays the date in European format.
		 * The final output should be as follows: 
		 * 
		 * American format: Saturday, February 13, 2021
		 * European format: Saturday February 13 2021
		 * 
		 */
		
		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
		System.out.println("European format: " + day + " " + month + " " + date + " " + year);
		
	}// end main
}// end class
