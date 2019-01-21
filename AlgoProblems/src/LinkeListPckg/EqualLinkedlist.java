package LinkeListPckg;

public class EqualLinkedlist {
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
	
	

	public static int checkList(Node l1, Node l2) {
		if (l1 != null && l2 != null) 
		{
			if (l1.data == l2.data) 
			{
				return checkList(l1.next, l2.next);
			}

			else {
				return 0;
			}
		}

		else if (l1 == null && l2 == null) 
		{
			return 1;
		} 
		
		else {
			return 0;
		}
	}

	public static void printLnkList(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
		
	}
	//1,2,3,4,5,6,7
	public static void DeletenthNode(Node head,int n)
	{
		Node temp=head;
		
		for(int i=0;i<n-1;i++)
		{
				temp=temp.next;
			
			
		}
		Node t=temp.next.next;
		temp.next=null;
		temp.next=t;
		
		
		

	}
	public static void main(String[] args) {

		EqualLinkedlist obj = new EqualLinkedlist();
		obj.head = new Node(10);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		obj.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		EqualLinkedlist obj1 = new EqualLinkedlist();
		obj1.head1 = new Node(10);
		Node n11 = new Node(1);
		Node n12 = new Node(2);
		Node n13 = new Node(3);
		Node n14 = new Node(4);
		obj.head1.next = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = null;

		int p = checkList(head, head1);
		System.out.println(p);
		
		DeletenthNode(head,1);
		printLnkList(head);


	}

}
