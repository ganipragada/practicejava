package generalPractice;

import java.util.ArrayList;

import java.util.ListIterator;

public class ItetaratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a5 = new ArrayList();
		a5.add("ramana");
		a5.add("paven");
		a5.add("ravi");
		a5.add('g');
		a5.add(null);
		a5.add('g');
		a5.add(123);

		ListIterator<Object> it = a5.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
