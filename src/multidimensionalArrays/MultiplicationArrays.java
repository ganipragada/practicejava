package multidimensionalArrays;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt();
		args = new String [size];
		for (int i = 0; i < size; i++) {
			args[i] = sc.nextLine();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(args[i]);
		}
		int a[][] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
		int b[][] = { { 9,8,7 }, { 6,5,4 }, { 3,2,1 } };
		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
