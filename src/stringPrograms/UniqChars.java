package stringPrograms;

import java.util.Arrays;

import org.apache.commons.lang3.ArraySorter;

public class UniqChars {

	public static void main(String[] args) {
		String s = "12389458738793228238294348645089849439483658346573465879838427326836530998877665443312336473638292028347467546509812346578";
		String un = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (un.indexOf(ch) == -1) {
				un += ch;
			}

		}
		System.out.println(" The uniq charactors of given string are = " + un);
		char[] charArray = un.toCharArray();
		Arrays.sort(charArray);
		String s1 = new String(charArray);

		System.out.println("The shoted list of unque charators of given string are = " + s1);
	}

}
