package TestPack;

public class ThirdFromLastLinkedlist {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public static Node finethirdLast(Node node, int n) {
		Node firstNode = head;
		Node secNode = head;
		for (int i = 0; i < n; i++) {
			firstNode = firstNode.next;

		}

		while (firstNode.next != null) {
			firstNode = firstNode.next;
			secNode = secNode.next;

		}
		return secNode;

	}

	public static boolean findLoppInList(Node node) {
		Node slow = node;
		Node fast = node;
		boolean b = true;
		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 hop
			fast = fast.next.next; // 2 hops

			if (slow == fast) {
				// b=false;
				// break;

			}

		}
		return b; // fast re

	}

	/*
	 * public static boolean removeLoop(Node node) { Node p1 = node; Node p2 =
	 * node.next; boolean b=true; while(p2==p1) { slow = slow.next; // 1 hop
	 * fast = fast.next.next; // 2 hops
	 * 
	 * if(slow == fast) { //b=false; //break;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * } return b; // fast re
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	public static void InsertinLast(Node head, int data) {
		Node new_node = new Node(data);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = new_node;

	}

	public static void InsertFirst(int data)
	{
		Node Fnode = new Node(data);
		Fnode.next = head;
		head = Fnode;
//		printList(head);

	}

	public static void printList() {
		
		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}


	}

	public static void main(String[] args) {

		ThirdFromLastLinkedlist obj = new ThirdFromLastLinkedlist();

		obj.head = new Node(12);
		Node n31 = new Node(13);
		Node n32 = new Node(14);
		Node n33 = new Node(15);
		Node n34 = new Node(5);
		Node n35 = new Node(1);
		obj.head.next = n31;
		n31.next = n32;
		n32.next = n33;
		n33.next = n34;
		n34.next = n35;
		n35.next = null;
		/* n36.next = n32; */

		// int k = obj.finethirdLast(head, 0).data;
		// boolean m =obj.findLoppInList(head);
		// System.out.println(m);
		// InsertinLast(head, 20);
		InsertFirst(54);
		printList();
	}

}
