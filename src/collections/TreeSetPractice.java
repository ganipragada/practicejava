package collections;

import java.util.TreeSet;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class TreeSetPractice {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("ramu");
		ts.add("praveen");
		ts.add("remo");
		ts.add("ganendra");
		ts.add("bhargavi");
		ts.add("poojitha");
		ts.add("renu");
		// ts.add(null);//If we add null objects it gives null pointer exception
		ts.add("renu");

//		ts.add(123);
//		ts.add(123.44);
//		ts.add('a');// Treeset not allow heterogeneous data if we try to add any data it's giving class cast exceptin 
		System.out.println("TreeSet collections are = " + ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println("after poll first and poll last = " + ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
	}
}
