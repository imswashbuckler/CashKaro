package AquestionAaamaaaaaazoooon;

public class DoublyCirculatedlinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		// Node head= new Node(15);

		DoublyCirculatedlinkedList dbl = new DoublyCirculatedlinkedList();
		dbl.head = new Node(10);
		Node n1=new Node(11);
		Node n2=new Node(12);
		Node n3=new Node(13);
		Node n4=new Node(14);
		dbl.head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=dbl.head;
		Node k=dbl.head;
	//	System.out.println(k.data);
		
		
		while(k.next!=null)
		{
			k=k.next;
			if(k.next==dbl.head)
			{
				Node nu=new Node(15);
				
				k.next=nu;
				k=nu;
				k.next=dbl.head;
			
		
			break;
			}
		}
		
		Node n=dbl.head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
			//System.out.println(k.data);
			if(n==dbl.head)
			{
				break;
			}
			
		}
		
		

	}

}
