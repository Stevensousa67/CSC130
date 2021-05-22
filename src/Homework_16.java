import java.util.Queue; import java.util.Stack; import java.util.LinkedList;

public class Homework_16 {
	
	public static void main(String[] args) {
		
		Queue<Integer> numberQ = new LinkedList<>();
		
		numberQ.add(4);
		numberQ.add(6);
		numberQ.add(8);
		numberQ.add(10);
		
		System.out.println("Original queue: " + numberQ);
		reverse(numberQ);
		System.out.println("Reversed queue: " + numberQ);
		
	}
	
	public static void reverse(Queue<Integer> numberQ) {
		
		Stack<Integer> stack = new Stack<>();
		
		while(!numberQ.isEmpty()) {
			stack.add(numberQ.peek());
			numberQ.remove();
		}
		
		while(!stack.isEmpty()) {
			numberQ.add(stack.peek());
			stack.pop();
		}
	}
}
