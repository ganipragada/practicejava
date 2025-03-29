package stringPrograms;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mallam", number = "135631";
		String rev = "";
		String rev1 = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		for (int i = number.length() - 1; i >= 0; i--) {
			rev1 += number.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println(name + " is a pallindrome string ");
		}
		else {
			System.out.println(name+ " is't a pallindrome String");
		}
		if (number.equals(rev1)) {
			System.out.println(number + " is a pallindrome number");		
		}
		else {
			System.out.println(number +" is't a pallindrome number");
		}
	}

}
