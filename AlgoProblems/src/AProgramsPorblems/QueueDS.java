package AProgramsPorblems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
public class QueueDS {
public static void main(String[] args) {
    Queue q1= new Queue();

	Queue<String> queue = new LinkedList<String>();
	queue.add("one");
	queue.add(null);
	queue.add("three");
	queue.add("four");
	System.out.println(queue);
	queue.remove();	
	System.out.println(queue);
	queue.clear();
	System.out.println(queue);
	System.out.println("Queue Size: " + queue.size());
	System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("one");
		//queue1.add(null);
		queue1.add("three");
		queue1.add("four");
		System.out.println(queue1);
	// To empty the queue
	queue.clear();
	
}
}
