package stringPrograms;

public class CoundAllWordsInGivenString {

	public static void main(String[] args) {
		String s = " i am ganendra frome tuni currently working as a software testing engineer in LG soft India in Bengulure";
		String s1 = s.trim();
		int count = 1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				count++;
			}

		}

		System.out.println("the total number of words in given string is = " + count);

	}

}
