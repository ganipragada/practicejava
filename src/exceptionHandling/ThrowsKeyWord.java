package exceptionHandling;
import java.util.Scanner;

public class ThrowsKeyWord {
	
	public static void  gani() throws InterruptedException {
		System.out.println("i am ganendra");
		Thread.sleep(3000);
		System.out.println("i have been working as a automation testing software engineer");
	
		
	}
	public static void vote() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter the vover voter name");
		name = sc.nextLine();
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		if (age<18) {
			throw new NotEligibleException(name, " is not eligible to vote");
			
		}
		else {
			System.out.println("He is elegible to vove, Please allow him");
		}
	}

	public static void main(String[] args) {
		try {
			gani();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vote();
		}

}
