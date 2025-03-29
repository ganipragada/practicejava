package rahulsettyAcademy;

import java.util.ArrayList;
import java.util.stream.Stream;
import org.testng.annotations.Test;

public class Streams {

	@Test
	public void main() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("gani");
		names.add("suresh");
		names.add("raja");
		names.add("surayya");
		names.add("ravi");
		names.add("prasad");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("r")) {
				System.out.println(name);
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("gani");
		names.add("suresh");
		names.add("raja");
		names.add("surayya");
		names.add("ravi");
		names.add("prasad");
		String sw = "g";
		long c = names.stream().filter(n -> n.startsWith(sw)).count();
		System.out.println(c + " starts with" + sw);

		// count total number of string inside the stream
		long c1 = Stream.of("presad", "ramana", "ramba", "aswarya").filter(s -> {
			s.startsWith("z");
			return true;
		}).count();
		System.out.println(c1);

		// pring the more then 4 latter string in given stream
		Stream.of("presad", "ramana", "ramba", "aswarya").filter(s -> s.length() > 4)
				.forEach(s -> System.out.println(s));

	}

	@Test
	public void moreThern4() {
		Stream.of("Ganni", "Ganga", "Presad", "Raja", "Ravi", "Ramana").filter(s -> s.length() > 4).limit(2)
				.forEach(s -> System.out.println(s));
	}

	@Test
	public void practice() {
		Stream.of("gani", "raja", "prased", "ganiii", "ramya", "bhargavi", "bhargavi", "rambabu")
				.filter(s -> s.startsWith("b"))
				.filter(s-> s.length()>=8 && s.length()<9)
				.distinct()
				.map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}
}
