public class Chapter2_Exercise3 {
	public static void main(String[] args) {
		
		/* 1) Create a new program called Time.java. From now on, we won't remind you to start 
		 * with a small, working problem, but you should. 
		 *
		 */
		
		System.out.println("Exercise 2.3");
		
		/* 2) Create variables named hour, minute, and second. Assign values that are roughly
		 * the current time. Use a 24-hour clock so that at 2:00PM the value of hour is 14. 
		 * 
		 */
		
		int hour = 21;
		int minute = 10;
		int second = 23;
		
		/* 3) Make the program calculate and display the number of seconds since midnight
		 * 
		 */

		int hour_to_seconds = hour*3600;
		int minute_to_seconds = minute*60;
		int total_seconds_since_midnight = hour_to_seconds + minute_to_seconds + second;
		
		System.out.println("It has passed " + total_seconds_since_midnight + " seconds since midnight");
		
		/* 4) Calculate and display the number of seconds remaining in the day
		 * 
		 */
		
		int total_seconds_day = 86399;
		int seconds_left_day = total_seconds_day - total_seconds_since_midnight;
		
		System.out.println("There are " + seconds_left_day + " seconds left in the day.");
		
		/* 5) Calculate and display the percentage of the day that has passed. You might run into
		 * problems when computing percentages with integers, so consider using floating-points
		 * 
		 */
		
		
		
		
	}// end main
}// end class
