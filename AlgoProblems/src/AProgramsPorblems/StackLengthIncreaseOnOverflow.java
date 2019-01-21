package AProgramsPorblems;

import java.util.Arrays;
import java.util.Stack;

public class StackLengthIncreaseOnOverflow {

	public void increaselegth(Integer i) {

		Stack<Integer> in = new Stack<Integer>();

	}

	static int max = 2;
	static int[] arr = new int[max];
	static int top = -1;
	// static int[] newArr;

	public static void push(Integer i) {
		if (top < max-1) {
			top++;
			arr[top] = i;

		}
		else
		{
			System.out.println("stack Overflow");
			max=max+1;
			arr = Arrays.copyOf(arr, max);
			top++;


			arr[top] = i;

		}
	}

	public static void pop() {
		if (top == -1) {
			System.out.println("stack undeflow");
		} else {
			System.out.println(arr[top]);
			top--;
		}
	}

	public static void peek() {
		if (top == -1) {
			System.out.println("stack is empty");
		} else {
			System.out.println(arr[top]);
		}
	}

	public static void main(String[] args) {

		StackLengthIncreaseOnOverflow obj = new StackLengthIncreaseOnOverflow();
		push(1);
		push(2);
		push(3);
		push(4);
		peek();

	}

}