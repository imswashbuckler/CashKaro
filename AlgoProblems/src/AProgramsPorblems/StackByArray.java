package AProgramsPorblems;

import java.util.Arrays;

public class StackByArray {
	
	static int max=11;
	
	static int[] arr = new int[max];
	static int top = -1;

	public static void push(int k) {
		if (top < arr.length) 
		{
			top++;
			arr[top] = k;
		} else {
			System.out.println("Stack Overflow");
		}
	}

	public static void pop() {
		if (top == -1) {
			System.out.println("Satck is empty");
		}
	//	arr[top]
		else
		{
		System.out.println(arr[top]);
		top--;
		// arr[top]=(Integer) null;
		
	}}

	public static int top() {

		return arr[top];

	}
public static void main(String[] args) {
	max=10;
	push(5);
	push(4);
	push(3);
	push(11);
	push(12);
	push(13);
	push(14);
	push(15);
	push(16);
	push(17);
	//push(18);
//pop();
//pop();
	;

	System.out.println(top());
	System.out.println(Arrays.toString(arr));
	pop();
	System.out.println(top);
	//System.out.println(pop())
	System.out.println(Arrays.toString(arr));
	
	
}
}