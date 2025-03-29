package methods;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayPractice {
	public void arrayPractice() {
		int a[] = new int[100];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] = i + 1);
		}

	}

	public void assendingOrder() {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size in an array");
		size = s.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		int ass;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					ass = a[j];
					a[j] = a[i + 1];
					a[j + 1] = ass;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] =" + a[i]);

		}
	}

	@Test
	public void missingNumbers() {
		int[] a = { 1, 6, 34, 60, 89, 77, 45, 33, 7, 8, 55 };
		boolean status = true;
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					status = false;
					break;
				}
			}
			if (status == true) {
				System.out.println(i);
			}
			status = true;
		}
	}
}
