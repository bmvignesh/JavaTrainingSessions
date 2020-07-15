package ArrayPractice;

import java.util.Scanner;

public class TwoDimArrayDisplay {
	public static void main(String[] args) {
		System.out.println("******Using for loop********");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Row length of an array :");
		int rowlength = scan.nextInt();
		System.out.println("Enter column length of an array :");
		int columnlength = scan.nextInt();
		System.out.println("Enter " + (rowlength * columnlength) + " Elements to Store in Array :");
		int int_array[][] = new int[rowlength][columnlength];
		for (int i = 0; i < rowlength; i++) {
			for (int j = 0; j < columnlength; j++) {
				int_array[i][j] = scan.nextInt();
			}
		}
		System.out.println("Elements in Array are: ");
		for (int i = 0; i < rowlength; i++) {
			for (int j = 0; j < columnlength; j++) {
				System.out.println("Row [" + i + "]: Column [" + j + "]: " + int_array[i][j]);
			}
		}
		System.out.println("******Using while loop********");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Row length of an array: ");
		int row = scan1.nextInt();
		System.out.println("Enter column length of an array: ");
		int col = scan1.nextInt();
		System.out.println("Enter " + (row * col) + " Elements to Store in Array: ");
		int arr[][] = new int[row][col];
		int k = 0;
		while (k < row) {
			int l = 0;
			while (l < col) {
				arr[k][l] = scan1.nextInt();
				l++;
			}
			k++;
		}
		System.out.println("Elements in Array are: ");
		int m = 0;
		while (m < row) {
			int n = 0;
			while (n < col) {
				System.out.println("Row [" + m + "]: Column [" + n + "]: " + arr[m][n]);
				n++;
			}
			m++;
		}
	}
}