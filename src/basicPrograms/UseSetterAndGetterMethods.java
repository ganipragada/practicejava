package basicPrograms;

import java.util.Scanner;

public class UseSetterAndGetterMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SetterAndGetterMethods sg = new SetterAndGetterMethods();
		System.out.println("pleace enter your name");
		String name = sc.nextLine();
		sg.setName(name);
		System.out.println(sg.getName());
		System.out.println("pleace enter your village ");
		String village = sc.nextLine();
		sg.setVillage(village);
		System.out.println(sg.getVillage());
		System.out.println("pleace enter your age");
		int age = sc.nextInt();
		sg.setAge(age);
		System.out.println(sg.getAge());
		System.out.println("pleace enter your phone number");
		long phno = sc.nextLong();
		sg.setPhno(phno);
		System.out.println(sg.getPhno());
		System.out.println("login successfully");
	}

}
