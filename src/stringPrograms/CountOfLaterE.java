package stringPrograms;

public class CountOfLaterE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Elefant is my fevered animal";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'E' || s.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("total e present inthe word is = " + count);
	}

}
