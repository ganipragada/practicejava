package stringPrograms;

public class StringConcatination {

	public static void main(String[] args) {
		// Type 1 :- directly we are concating a string it will not concate
		String s = "Ganendra";
		s.concat(" Pragada");
		System.out.println(s);
		// But we wrote directly in print statement it will concat
		System.out.println(s.concat(" Pragada"));

		// Type 2 : Concat first and printit
		String s1 = "Suresh";
		s1 = s1.concat(" Pragada");
		System.out.println(s1);
		
		//Type 3: Tack one extra variable and assign to concat object
		String s2 = "Raja";
		String s3 = s2.concat(" Pragada");
		System.out.println(s3);
		
	}

}
