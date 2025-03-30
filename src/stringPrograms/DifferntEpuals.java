package stringPrograms;

public class DifferntEpuals {

	public static void main(String[] args) {
		String s = "java";
		String s1 = new String("java");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		String s3 = s;
		System.out.println(s3.equals(s1));
		System.out.println(s3==s1);
		String s4 = "JAVA";
		System.out.println(s.equalsIgnoreCase(s4));
		System.out.println(s.equals(s4));

	}

}
