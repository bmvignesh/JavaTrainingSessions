package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
		System.out.println(x.length); // 3 -- total no. of rows =3
		System.out.println(x[x.length - 1].length); // 5 -- total no. of columns = 5

		// 1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";

		// 2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";

		// 3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";

		System.out.println(x[1][2]);
		System.out.println(x[2][2]);

		System.out.println(x[0][4]);

		// print all the values of 2d array: use for loop

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[x.length - 1].length; col++) {
				System.out.println(x[row][col]);
			}
		}

		// print all the values of 2d array: use while loop

		System.out.println("**********************");
		int rows = 0;
		while (rows < x.length) {
			int cols = 0;
			while (cols < x[x.length - 1].length) {
				System.out.println(x[rows][cols]);
				cols++;
			}
			rows++;
		}

	}

}
