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
		
		int total_seconds_day = 86400;
		int seconds_left_day = total_seconds_day - total_seconds_since_midnight;
		
		System.out.println("There are " + seconds_left_day + " seconds left in the day.");
		
		/* 5) Calculate and display the percentage of the day that has passed. You might run into
		 * problems when computing percentages with integers, so consider using floating-points
		 * 
		 */
		
		// Needed to convert int variables to float types in order to make division produce an outcome.
		float porcentage = ((float)total_seconds_since_midnight / (float)total_seconds_day) * 100;
		
		System.out.println(porcentage + "% of the of the day has passed so far.");
		
		/* 6) Change the values of hour, minute, and second to reflect the current time. Then write 
		 * code to compute the elapsed time since you started working on this exercise.
		 * 
		 */
		
		int current_hour = 9;
		int current_minute = 30;
		int current_second = 30;
		
		int time_elapsed_hour = hour - current_hour;
		int time_elapsed_minute = current_minute - minute;
		int time_elapsed_second = current_second - second;
		
		System.out.println("Time elapsed doing Exercise 3: " + time_elapsed_hour + " hours " + time_elapsed_minute + " minutes " + time_elapsed_second + " seconds.\n"
				+ "That's because I finished 3.4 and went to bed last night. Finished this morning.");
		
		
	}// end main
}// end class
