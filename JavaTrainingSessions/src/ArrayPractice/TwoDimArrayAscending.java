package ArrayPractice;

import java.util.Scanner;

public class TwoDimArrayAscending {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row length of array: ");
		int row = scan.nextInt();
		System.out.println("Enter the column length of array: ");
		int col = scan.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value of element at position Row [" + i + "] Column[" + j + "] :");
				a[i][j] = scan.nextInt();
				b[i][j] = a[i][j];
			}
		}
		int temp = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int m = 0; m < i; m++) {
					for (int n = 0; n < j; n++) {
						if (a[i][j] > a[i + m][j + n]) {
							temp = a[i][j];
							a[i][j] = a[i + m][j + n];
							a[i + m][j + n] = temp;
						}
					}
				}

			}
		}
		System.out.println("Original array before sort in ascending order: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println("Array after sorted in ascending order: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(a[i + row - 1][j + col - 1]);
			}
		}
	}
}