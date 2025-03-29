package stringPrograms;

public class ReverseOfAString {

	public static void main(String[] args) {
		String name = " i am ganendra pragada";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("reverse of string is = " + reverse);
	}

}
