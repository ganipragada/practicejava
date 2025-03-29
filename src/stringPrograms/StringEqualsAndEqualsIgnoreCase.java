package stringPrograms;

public class StringEqualsAndEqualsIgnoreCase {

	public static void main(String[] args) {
		String s = "java";
		String s1 = "java";
		String s2 = "jaava";
		String s3 ="JAVa";
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s3));
	}

}
