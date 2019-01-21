package SortingandMerging;

import java.util.LinkedList;


public class SortLinkedlist {
	 static Node head;	
	  static class Node
	{
		Node next;
		Integer data;
		Node(Integer data)
		{
			this.data=data;
			this.next=null;	
		}
		
		 public int getData() {return data;}
	     
		    public void setData(int newData) {data = newData;}
		     
		    public Node getNext() {return next;}
		     
		    public void setNext(Node newNode) {next = newNode;}
		
		     
		    public Node getHead() {return head;}
		     
		    public void setHead(Node n) {head = n;}
		     

	
}
	  
	  public void Method1Sort() {
	                Node current = head;
	            Node counter = current;
	            while(counter.getNext().getNext() != null) {
	                current = counter;
	                while(current.getNext() != null) {
	                    if(current.getData() > current.getNext().getData()) {
	                        int temp = current.getData();
	                        current.setData(current.getNext().getData());
	                        current.getNext().setData(temp);
	                    }
	                    current = current.getNext();
	                }
	                counter = counter.getNext();
	            }
	    		display();

	        }
	    
	
	  public static void display()
	  {
		  Node temp=head;
		  while(temp!=null)
		  {
			  System.out.println(temp.data);
			  temp=temp.next; 
		  }
		  
	  }
	  
	  public void Method2Sort() {
			Node node = head;

			for (Node node1 = head; node1 != null; node1 = node1.next) {

				for (Node node2 = node1.next; node2 != null; node2 = node2.next) {
					if (node1.data > node2.data) {
						int temp = node1.data;
						node1.data = node2.data;
						node2.data = temp;

					}
				}

			}
			display();

		}

	public static void main(String[] args) {
		SortLinkedlist list = new SortLinkedlist();
		list.head= new Node(10);
		Node obj1= new Node(33);
		Node obj2= new Node(13);
		Node obj3= new Node(23);
		Node obj4= new Node(31);
		list.head.next=obj1;
		obj1.next=obj2;
		obj2.next=obj3;
		obj3.next=obj4;
		obj4.next=null;
		Node p=head;
		
		list.Method1Sort();
		
		//list.Method2Sort();
		
	}

}
