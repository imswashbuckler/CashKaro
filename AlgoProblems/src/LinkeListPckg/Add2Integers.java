package LinkeListPckg;

import LinkeListPckg.ReveseLinkedlist.Node;

public class Add2Integers {
	
	static Node head;
	static Node head1;
	static Node head3;


	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}

public static void Add2IntegersN(Node node1,Node node2)
{
	while(node1!=null && node2!=null)
	{
		int data=node1.data+node2.data;
		
		
		
		
		
	}


}
	
	
	public static void displayLinklIst(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+",");
			node=node.next;

			
		}
		
		
	}
	static void reverse(Node node) {
		
		Node curr = node;
		Node prev = null;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		node = prev;

	}

	public static void main(String[] args) {
		
		Add2Integers obj=new Add2Integers();
		 obj.head=new Node(8);
		 Node n1=new Node(2);
		 Node n2=new Node(3);
		 Node n3=new Node(4);
		 Node n4=new Node(5);
		 Node n5=new Node(6);
		 Node n6=new Node(7);
	
		 head.next=n1;
		 n1.next=n2;
		 n2.next=n3;
		 n3.next=n4;
		 n4.next=n5;
		 n5.next=n6;
		 n6.next=null;
		 
		 Add2Integers obj1=new Add2Integers();
		 obj1.head1=new Node(9);
		 Node n11=new Node(2);
		 Node n12=new Node(3);
		 Node n13=new Node(4);
		 Node n14=new Node(5);
		 Node n15=new Node(6);
		 Node n16=new Node(7);
	
		 head1.next=n11;
		 n11.next=n12;
		 n12.next=n13;
		 n13.next=n14;
		 n14.next=n15;
		 n15.next=n16;
		 n16.next=null;
		 displayLinklIst(head); 
		 System.out.println();
		displayLinklIst(head1); 
		System.out.println();
		reverse(head);
		 displayLinklIst(head); 
			reverse(head1);
			System.out.println();
			 displayLinklIst(head1); 



		 

	}

}
