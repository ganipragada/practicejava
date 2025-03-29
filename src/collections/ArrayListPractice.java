package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class ArrayListPractice {
	public static int a = 123;
	public static ArrayList a5;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		// It's support heterogeneous data
		a1.add("gani");
		a1.add("raju");
		a1.add(a);
		a1.add(112);
		a1=a5;
		System.out.println(a1.contains(123));
		System.out.println("heterogeneous data = " + a1);
		// It's allowed duplicates
		Integer b = 123;
		a1.add(123);
		System.out.println("after adding duplicates = " + a1);
		// it's allowed null objects
		a1.add(null);
		System.out.println("it's allowes null = " + a1);
		// remove one object with object value
		a1.remove("raju");
		System.out.println("remove one object with object value raju = " + a1);
		// Remove one object with index
		a1.remove(2);
		System.out.println("Remove one object with index 1 = " + a1);
		// Set a value in particular index, it is replace the value
		a1.set(1, "raja");
		System.out.println("Set a value in particular index 1 = " + a1);
		// Add one value into the collection in the particular index
		a1.add(0, "Suresh");
		System.out.println("check collection is empty or not = " + a1.isEmpty());
		System.out.println("Add one object in particular index = " + a1);
		// let you know the size of the array
		System.out.println("size of the array is " + a1.size());
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		System.out.println("after copying a1 to a2 = " + a2);
		System.out.println("check a1 all objects contains a2  = " + a1.containsAll(a2));

		for (Object object : a2) {
			System.out.println(object);
		}

		// Cursors in ArrayList
		ListIterator il = a1.listIterator();
		System.out.println("Iterator for forwoad direction");
		while (il.hasNext()) {
			System.out.println(il.next());
		}
		
		
		
		System.out.println("Itetator for the backwoad direction");
	
		while (il.hasPrevious()) {
			System.out.println(il.previous());
			
		}
		ArrayList<String> a3 = new ArrayList<>();
		a3.add("gani");
		a3.add("suresh");
		a3.add("raja");
		a3.add("ramesh");
		a3.add("praveen");
		Collections.sort(a3);
		System.out.println("Increasing sorted order : " + a3);
		Collections.reverse(a3);
		System.out.println("Reverse sored order : " + a3);

	}

}
