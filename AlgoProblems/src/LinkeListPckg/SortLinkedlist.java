package LinkeListPckg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
public class SortLinkedlist {
	 static Node head;	
	  static class Node
	{
		Node next;
		int data;
		Node(int data)
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
			  System.out.print(temp.data+",");
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
		SortLinkedlist obj = new SortLinkedlist();
		obj.head = new Node(10);
		Node obj1 = new Node(21);
		Node obj2 = new Node(31);
		Node obj3 = new Node(15);
		Node obj4 = new Node(52);
		Node obj5 = new Node(12);
		obj.head.next = obj1;
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		// obj.display();
		obj.Method1Sort();
		System.out.println("*********");
		obj.Method2Sort();
	
	}}
