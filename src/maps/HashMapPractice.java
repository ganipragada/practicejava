package maps;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<>();
		m1.put(101, "ganendra");
		m1.put(102, "bhargavi");
		m1.put(103, "raja");
		m1.put(107, "praveen");
		m1.put(109, "ravi");
		System.out.println("hashmap objects are = " + m1);
		m1.put(103, "prabhas");
		System.out.println("after adding duplicate key = " + m1);
		m1.put(100, "ganendra");
		System.out.println("after adding duplicate value = " + m1);
		System.out.println("all keys  = " + m1.keySet());
		System.out.println("all values = " + m1.values());
		System.out.println("get particular value with using of key = " + m1.get(101));
		System.out.println("check key is present or not = "+m1.containsKey(107));
		System.out.println("check value is present or not = "+m1.containsValue("pawan kalyan"));
		

	}
}
