// Steven Sousa - Homework 7 - 3/7/21

public class Homework07 {

	public static void main(String[] args) {
		System.out.println("Question 1:");
		System.out.println("public void set(int i, String s) throws IndexOutOfBoundsException{");
		System.out.println("  if(int i >= size() || i < 0){");
		System.out.println("      throw new IndexOutOfBoundsException()}");
		System.out.println("  array[i] = s;}");	
		System.out.println();
		
		System.out.println("Question 2:");
		System.out.println("public boolean contains(String s){");
		System.out.println("  for(String v : array){ ");
		System.out.println("    if(s.equals(v)){");
		System.out.println("      return true;}");
		System.out.println("    else{return false;}");
		System.out.println();
		
		System.out.println("Question 3:");
		System.out.println("public int indexOf(String s){");
		System.out.println("   for(int i = 0; i < s.size(); i++){");
		System.out.println("      if(s.equals(array[i])){ return i;}");
		System.out.println("   i = -1;");
		System.out.println("   return i;");
		System.out.println();
		
		System.out.println("Question 4:");
		System.out.println("Size = 15 and Length = 20");
	}
}