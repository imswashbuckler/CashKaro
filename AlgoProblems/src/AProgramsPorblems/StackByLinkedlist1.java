package AProgramsPorblems;

public class StackByLinkedlist1 {
	static Node head;
	
	static class Node 
	{
		int data;
		Node next;
	
	
	 Node(int data)
	{
		this.data=data;
		this.next=null;
		
	}

	public void  push(int data)
	 {

		Node temp=new Node(data);
		temp.next=head;
		head=temp;
		
	 }
	public static void  pop()
	 {
		System.out.println("Pop:"+head.data);
		Node temp=head;
		temp=head.next;
		head=temp;
		
	 }
	 
	public static void  dispplay(Node head)
	 {
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
			
		}
		
		
	 }
	 
	public static void main(String[] args) 
	{
	
		StackByLinkedlist1 ll=new StackByLinkedlist1();
		ll.head=new Node(1);
		Node n1=new Node(2);
		Node n2=new Node(3);
		Node n3=new Node(4);
		Node n4=new Node(5);
		ll.head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		pop();
		dispplay(head);

		
		
	}

}
}