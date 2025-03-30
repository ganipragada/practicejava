package stringPrograms;

public class FindFrequencyOfSubString {

	public static void main(String[] args) {
		String s = "java java selenium sql java";
		String s1 = "java";
		clear(s, s1);
	}

	public static void clear(String s, String s1) {
		int count = 0;
		String[] s3 = s.split(" ");
		for (int i = 0; i < s3.length; i++) {
			if (s3[i].equals(s1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
