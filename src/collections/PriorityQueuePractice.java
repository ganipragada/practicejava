package collections;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	public static void main(String[] args) {
		
		PriorityQueue<Object>  q1 = new PriorityQueue<>();
		q1.add("raju");
		q1.add("ramana");
		q1.add("ramesh");
		q1.add("pavan");
		q1.add("ganendra");
		q1.add("kiran");
		q1.add("123");
		q1.add("123.88");
		System.out.println("tatal collection objects = "+q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1.contains("123"));
		while(q1.peek()!=null) {
			System.out.println(q1.poll());
		}
		System.out.println("after while loop");
	
	}
}
