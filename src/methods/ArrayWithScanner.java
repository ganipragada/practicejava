package methods;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter the size of an array");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the array " +(i+1)+"th value");
			a[i] = sc.nextInt();
		}
		System.out.println("the array elements are 5");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);	
		}
	}

}
