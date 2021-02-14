public class Chapter3_Exercise1 {
	public static void main(String[] args) {
		
		/* 1) When you use printf, the Java compiler does not check your
			  format string. See what happens if you try to display a value with type int
			  using %f. And what happens if you display a double using %d? What if you
			  use two format specifiers, but then provide only one value?
		 * 
		 */
		
		int test1 = 1;
		System.out.printf("Printing a int test: %d\n", test1);
		
		// Using %f for integers displays the following error:
		// Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer
		
		
		double test2 = 2.2;
		System.out.printf("Printing a double test: %f\n", test2);
		
		// Using %d for doubles displays the following error:
		// Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
		
		//System.out.printf("Printing using one specifier: %d%f", test1);
		
		// Using two specifiers while providing one value gives the following error:
		// Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%f'

		
	}// end main
}// end class