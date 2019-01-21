package AProgramsPorblems;

import java.util.EmptyStackException;

public class StackByLinkedlist {

	static int top;
	static Node head;

	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void push(int data) {
		Node temp = new Node(data);
		if (head != null) {

			temp.next = head;
			head = temp;
			// head=temp;

			top++;
		} else {
			head = temp;
			head.next = null;
		}

	}

	public static Object pop() {

		Node temp = head;

		if (head != null) {
			temp = head;
			head = head.next;
			top--;
			return temp.data;
		} else {
			System.out.println("List is empty");

		}
		return temp.data;

	}

	public static Object peek() throws NullPointerException {

		if (head != null)
		{
			return head.data;
		} 
		else 
		{
System.out.println("List is Empty");		}
		return head.data;
	}

	public static void displayNodes()
	{
		
		if(head!=null)
{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;

		}
}
		else
		{
			System.out.println("List is Empty");
			
		}
		

		
	}

	public static void main(String[] args) {

		StackByLinkedlist ls = new StackByLinkedlist();
		 push(5);
		push(7);
		// push(8);
		// push(9);
		displayNodes();
		// System.out.println(peek());
		System.out.println();
		 System.out.println(pop());
		displayNodes();
		System.out.println();

		 System.out.println(pop());
			System.out.println();

			displayNodes();

		// System.out.println();
		// System.out.println(peek());
	}

}