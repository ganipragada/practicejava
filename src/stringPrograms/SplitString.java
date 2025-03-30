package stringPrograms;

public class SplitString {
	public static void main(String[] args) {
		String s = "i am ganendra pragada i am from tuni i have been working as a Automation test engineer";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		String a = "java developer";
		String[] ch = a.split("");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
