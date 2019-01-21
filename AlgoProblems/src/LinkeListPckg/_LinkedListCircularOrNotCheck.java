package LinkeListPckg;

import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

import LinkeListPckg.SortLinkedlist.Node;

public class _LinkedListCircularOrNotCheck {
	 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    static int detectAndRemoveLoop(Node head) {
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
              //  removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }
 
     // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
    	_LinkedListCircularOrNotCheck obj = new _LinkedListCircularOrNotCheck();
    	obj.head = new Node(50);
        Node obj1 = new Node(21);
		head.next=obj1;
		obj1.next=head;
	//	obj1.next = null;
	
         int b=detectAndRemoveLoop(head);
          System.out.println(b);
          
          
              	
        }
        
    }
