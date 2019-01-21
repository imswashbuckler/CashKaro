 package LinkeListPckg;

public class RemoveDuplicatesSortedLinkLst {
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
		//	 next=null;
				
		}
		
		
	}
		
public void RemoveDuplicates() 
	{
	    Node first=head;
	   Node second=null;
	 
	if(head==null||head.next==null)
	{
		return ;
		
	}
	
	for(Node node=head;node!=null;node=node.next)
	{
	//	Node first=node;
		
		for(Node nodeJ=node.next;nodeJ.next!=null;nodeJ=nodeJ.next)
		{
			if(node.data==nodeJ.data)
			{
				node.next =nodeJ.next;
				//first.next=null;
				first.next=second;
			}
			else
			{
				first=first.next;
				
			}	
		}
	}
	}	    
public void print()
{
	Node temp =head;
while(temp!=null)
{
	
System.out.format("%d ", temp.data);
	temp=temp.next;
}

}
 public static void main(String[] args)
	{
	 RemoveDuplicatesSortedLinkLst list= new RemoveDuplicatesSortedLinkLst();
	 list.head = new Node(11);
	 Node obj1 = new Node(12);
	 Node obj2 = new Node(13);
	 Node obj3 = new Node(14);
	 Node obj4 = new Node(15);
	 Node obj5 = new Node(11);
	 list.head.next=obj1;
	 obj1.next=obj2;
	 obj2.next=obj3;
	 obj3.next=obj4;
	obj4.next=obj5;
	obj5.next=null;
	list.print();
	System.out.println();
	list.RemoveDuplicates();
list.print();	
	
	}
}
