package ArrayPractice;

import java.util.Scanner;

public class SingleDimArrayAscending {

	public static void main(String[] args) {

//	Logic:
//		1. Get the array size
//		2. Get the array elements
//		3. Compare one element with every other element such that smallest element is placed first and biggest element
//		is placed at the last and vice versa for descending order
//		4. Print the arranged array

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+i+" element of the array");
			a[i] = s.nextInt();
			b[i] = a[i];
		}
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Original array structure: ");
		for (int i = 0; i < n; i++) {
			System.out.println(b[i]);

		}
		System.out.println("Array in ascending format: ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
