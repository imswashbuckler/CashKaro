package LinkeListPckg;

public class _AddTwoLinkedlist {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void displaylist() 
	{
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}

	}
	public static void Add2LinkList(Node head1, Node head2)
	{
		Node temp1=head;
	//	Node temp2=head;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		
		temp1.next=head2;
			
		
		
	}
		

	public static void main(String[] args) {

		_AddTwoLinkedlist ls = new _AddTwoLinkedlist();
		ls.head = new Node(1);
		Node n = new Node(2);
		Node n1 = new Node(13);
		Node n2 = new Node(4);
		Node n3 = new Node(15);
		Node n4 = new Node(61);
		Node n5 = new Node(19);
		Node n6 = new Node(6);
		n6.next=null;
		ls.head.next = n;
		n.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		displaylist();
		System.out.println("----------------------------");
		_AddTwoLinkedlist ls1 = new _AddTwoLinkedlist();
		ls1.head = new Node(11);
		Node n31 = new Node(12);
		Node n32 = new Node(3);
		Node n33 = new Node(41);
		Node n34 = new Node(5);
		Node n35 = new Node(1);
		Node n36 = new Node(9);
		Node n37 = new Node(21);
		

		ls.head.next = n31;
		n31.next = n32;
		n32.next = n33;
		n33.next = n34;
		n34.next = n35;
		n35.next = n36;
		n36.next = n37;
		n37.next=null;
		displaylist();
		
		
		_AddTwoLinkedlist ls2 = new _AddTwoLinkedlist();
		
		
		
		
	}

}
