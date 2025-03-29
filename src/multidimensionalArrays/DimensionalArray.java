package multidimensionalArrays;

import java.util.Scanner;

public class DimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the column size");
		int column = sc.nextInt();
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		int a[][] = new int[column][row];
		for (int i = 0; i < column; i++) {
			System.out.println("Enter the"+(i+1)+"column values4");
			for (int j = 0; j < row ; j++) {
				a[i][j] = sc.nextInt();		
			}	
		}
		
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println("value at a[" + i + "][" + j + "]th : " + a[i][j]);

			}
		}

	}

}
