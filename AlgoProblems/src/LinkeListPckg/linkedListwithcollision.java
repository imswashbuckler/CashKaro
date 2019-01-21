package LinkeListPckg;

public class linkedListwithcollision {
	static Node head;
	static Node head1;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void testCollssionNode(Node head, Node head2) {
		Node temp1 = head;
		while (temp1 != null) 
		{
			Node temp2 = head2;

			while (temp2 != null) {

				if (temp1 == temp2) {
					System.out.println(temp2.data);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}

	}

	public static void main(String[] args) {

		linkedListwithcollision cs = new linkedListwithcollision();
		linkedListwithcollision cs2 = new linkedListwithcollision();
		Node n0 = new Node(0);
		cs.head = n0;
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node m1 = new Node(8);
		Node m2 = new Node(9);
		cs.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
		 cs2.head1 = m1;
		cs2.head1.next = m2;
		m2.next = n4;
		n4.next = null;
		testCollssionNode(head,head1);

	}

}
