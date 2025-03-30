package stringPrograms;

public class StringMethods {

	public static void main(String[] args) {
	String s ="ganendra pragada";
	String s1 = s.toUpperCase();
	System.out.println(s1);
	String s2 = s1.toLowerCase();
	String s3 ="";
	System.out.println(s2);
	System.out.println(s.startsWith("g"));
	System.out.println(s.endsWith("da"));
	System.out.println(s1.startsWith("g"));
	System.out.println(s.concat("dra"));
	System.out.println(s3.isEmpty());
	System.out.println(s.concat(" "+s2));
	}
}
