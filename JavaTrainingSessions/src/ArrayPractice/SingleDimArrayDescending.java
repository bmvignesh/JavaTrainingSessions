package ArrayPractice;

import java.util.Scanner;

public class SingleDimArrayDescending {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int count = s.nextInt();
		int a[] = new int[count];
		int b[] = new int[count];
		int temp = 0;
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < count; i++) {
			System.out.println("Enter the " + i + "th element of the array");
			a[i] = s.nextInt();
			b[i] = a[i];
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Original array input: ");
		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Array in descending order");
		for (int i = 0; i < count; i++) {
			System.out.println(a[i]);
		}
	}

}
