package LinkeListPckg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AutoDeskIntrViewQuestions {

	static Node head;
	static int count=1;
	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void displalInklist(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}
	}

	public static void repetedwords(String file) throws IOException {
		File fl = new File(file);
		FileReader fr = new FileReader(fl);

		/*
		 * int k; while ((k = fr.read()) != -1) { Character m = (char) k; //
		 * System.out.println(m); System.out.print(k); }
		 */Map<String, Integer> mp = new HashMap<String, Integer>();
		BufferedReader bfr = new BufferedReader(fr);
		String line;
		while ((line = bfr.readLine()) != null) {
			String[] sl = line.split(" ");
			for (int i = 0; i < sl.length; i++) {
				if (mp.containsKey(sl[i])) {
					mp.put(sl[i], mp.get(sl[i]) + 1);
				} else {
					mp.put(sl[i], 1);

				}

			}

		}

		// System.out.println(mp.entrySet());

	}

	public static void fibonacci(int n) {

		int[] fib = new int[n];

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

		}

		System.out.println(Arrays.toString(fib));

	}

	public static void TriangleRowwise (int n) 
	{
		while(n>0)
		{
			for(int i=1;i<n+1/2;i++)
			{
				System.out.print(" ");
			}
		
			
			for(int i=0;i<count;i++)
			{
				System.out.print("*");
				
			}
			count=count+2;
			n--;
			System.out.println();
		}
		
	}

	public static int fibonacciByRecurssion(int i) {

		if (i == 0) {
			return 0;
		} else if (i < 2) {
			return 1;

		}

		int k = fibonacciByRecurssion(i - 1) + fibonacciByRecurssion(i - 2);

		return k;
	}

	public static boolean CircularOrnot(Node head) {
		Node node1 = head;
		Node node2 = head;
		boolean k = false; // 1 2 3 4 1
		while (node1 != null && node2 != null && node2.next == null) {
			node1 = node1.next;
			node2 = node2.next.next;

			if (node1 == node2) {
				k = true;
				return k;
			}

		}
		return k;
	}

	public static void main(String[] args) throws IOException {
		AutoDeskIntrViewQuestions obj = new AutoDeskIntrViewQuestions();
		obj.head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		obj.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		// displalInklist(head);
		boolean b = CircularOrnot(head);
		// System.out.println(b);
		repetedwords("D://AAA.txt");
		// fibonacci(10);
		TriangleRowwise(10);



	}
}
