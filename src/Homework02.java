public class Homework02 {
		
	int countDivisibleElements(int[] a, int divisor) {
		
		int count = 0;
		boolean divisibleFound = false;
			
		int i = 0;
			
		while (i < a.length) {
			if (a[i] % divisor == 0) {
					
				divisibleFound = true;
				count++;
				
			}// end if
				
			i++;
			
		}// end while
				
		if (divisibleFound) {
			return count;
				
		}// end if
			
		else {
			return 0;
				
		}// end else
			
	}// end countDivisibleElements
	
	public static void main(String[] args) {
		
		int[] a = {10,15,20};
		int divisor = 2;
		
		//countDivisibleElements(a,divisor);
	
	}// end main
	
}// end class