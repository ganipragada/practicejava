package stringPrograms;

public class ReplaceString {
	public static void main(String[] args) {
		String s = "i am a automation test engineer with 4.3 years of expreance";
		String rChar = s.replace('4', '2');
		System.out.println(rChar);
		String rString = rChar.replaceAll("expreance", "experience");
		System.out.println(rString);
		String rep = "GFGRGHRDFfhiofhf789418749";
		String repCabs =rep.replaceAll("[A-Z]", "");
		System.out.println(repCabs);
		String repSmall = repCabs.replaceAll("[a-z]", "");
		System.out.println(repSmall);
		String repNum = repSmall.replaceAll("[1-9]", ",");
		System.out.println(repNum);
		
	}
}
