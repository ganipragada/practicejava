package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListWithQueueInterface {

	public static void main(String[] args) {
		Queue<Object> q1 = new LinkedList<>();
		q1.add(123);
		q1.add("gani");
		q1.add(123.345);
		System.out.println(q1);
		while (q1.peek() != null) {
			System.out.println(q1.poll());
		}
		System.out.println("After while loop q1 = ");
	}

}
