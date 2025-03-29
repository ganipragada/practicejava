package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSetInterface {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("aaa");
		h1.add("b");
		h1.add("c");
		h1.add("zzzzz");
		h1.add("d");
		h1.add("b");
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);
		Iterator it = h1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
