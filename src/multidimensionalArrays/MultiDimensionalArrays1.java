package multidimensionalArrays;

import java.util.Scanner;

public class MultiDimensionalArrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number ");
		int row = sc.nextInt();
		System.out.println("Enter the column number");
		int col = sc.nextInt();
		String name[][] = new String[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
		  System.out.print("Enter the names ");
				name[i][j] = sc.nextLine();
			}
		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println("name["+i+"]["+j+"] = "+name[i][j]);
			}

		}
	}
}
