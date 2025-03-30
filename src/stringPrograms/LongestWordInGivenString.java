package stringPrograms;

import java.util.Iterator;

public class LongestWordInGivenString {

	public static void main(String[] args) {
		String s = "i am a java developer and also teamlead in my current project";
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]+" = "+s1[i].length());
		}
		int max = 0;
		String largest ="";
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length()>max) {
				max=s1[i].length();
				largest = s1[i];
				
			}
		}
		System.out.println("The longest word from the string is "+largest+" it is having total =  "+max+" letters");
	}

}
