
public class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public void show() {
		
		for(int element : queue)
			System.out.println(element + " ");
	}
	
	
}
