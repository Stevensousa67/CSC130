import java.util.*;
public class MidTerm {
	
	public static void main(String[] args) {
		
		class Node{
			String data;
			Node next;
			Node(String data){
				this.data = data;
			}
			void setNext(Node n) {
				next = n;
			}
		}
		
		// Create Nodes
		Node head = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node tail = new Node("D");
		
		// Connect Nodes
		head.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = tail;
		
		// delete last node
		Node temp = tail;
		temp.data = null;
		System.out.println("Last node starting from: " + temp.data);
		System.out.println("Last node of starting from head: " + head.next.next.next.data);
	}
}