package LinkeListPckg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.apache.http.entity.mime.Header;

public class AddDeleteSwapNodelnklst {

	Node head;

	static class Node {
		Integer data;
		Node next;;

		Node(int value) {
			this.data = value;
			this.next = null;
		}

	}

	public void deleteNthNodebyvalue(int k) {
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.data != k)
		{
			prev = temp;
			temp = temp.next;

		}

		if (temp == null)

		{
			System.out.println("Nodes does not exists");

		}
		prev.next = temp.next;

	}

	public void deleteNthNodebyvalue1(int k) {

		Node temp = head;
		Node prev = null;

		if (temp == null)

		{
			System.out.println("Nodes does not exists");

		}

		while (temp != null) 
		{
			if (temp.data == k) 
			{
				prev.next = temp.next;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	public void DeleteByPosition(int k) {

		Node temp = head;
		Node prev = null;
		int count = 1;
		if (k == 1) {
			head = temp.next;
		}
		if (k > 1) {
			while (temp != null) {
				prev = temp;
				temp = temp.next;
				// System.out.println(prev.data+"Data"+temp.data );
				count = count + 1;
				if (count == k) {
					System.out
							.println(prev.next.data + "Data" + temp.next.data);
					prev.next = temp.next;
					break;
				}

			}
		}
	}

	public void AddNewNodeonPosition(int k) {
		Node newone = new Node(21);
		Node temp = head;
		Node prev = null;
		int count = 1;
		if (k == 1) {
			temp = head;
			head = newone;
			newone.next = temp;
		}
		if (k > 1) {
			while (temp != null) 
			{
				prev = temp;
				temp = temp.next;
				count = count + 1;
				if (count == k) 
				{
				prev.next = newone;
				newone.next = temp;
				}

			}
		}
	}

	public void AddNewNodeonFromTail() {
		Node newone = new Node(31);
		Node temp = head;
		//Node prev = null;

		while (temp.next != null) {
		//	prev = temp;
			temp = temp.next;

		}
		temp.next = newone;
		newone.next = null;

	}

	public void checkPalinddrom() {
		Node node = head;
String str="Abcd";

		
		Stack<Integer> stk = new Stack<Integer>();
		while (node != null) {
			stk.push(node.data);
			node = node.next;

		}
		boolean pali=true;
		

		while (head != null) {
			
			System.out.println(head.data);
			if (!head.data.equals(stk.pop()))
			{
				pali=false;
				break;
			
			}
			head=head.next;

		}
		
System.out.println(pali);
	}

	public void swapData(int x, int y)

	{
		Node FirstNode = head;
		Node SecondNode = head;

		for (int i = 0; i < x; i++) {
			FirstNode = FirstNode.next;
		}

		for (int j = 0; j < y; j++) {
			SecondNode = SecondNode.next;
		}

		int temp = FirstNode.data;
		FirstNode.data = SecondNode.data;
		SecondNode.data = temp;

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		AddDeleteSwapNodelnklst list = new AddDeleteSwapNodelnklst();
		list.head = new Node(10);
		Node obj1 = new Node(11);
		Node obj2 = new Node(12);
		Node obj3 = new Node(13);
		Node obj4 = new Node(12);
		Node obj5 = new Node(11);
		Node obj6 = new Node(15);
		list.head.next = obj1;
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj6;
		obj6.next = null;
		// list.printList();
		//System.out.println();
		//System.out.println();
		// list.printList();

		// list.deleteNthNodebyvalue1(12);
		// list.DeleteByPosition(4);

		// list.AddNewNodeonPosition(4);
		// list.swapData(11, 14);
		// list.swapData(0, 1);
		// list.AddNewNodeonFromTail();
		list.printList();
		list.checkPalinddrom();
	}

}
