package OopsConcept1;

public class WrapperClass {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// Data conversion from String to Integer
		int a = Integer.parseInt(x);
		System.out.println(a + 20);

		// Integer, Double, Char, Boolean

		String y = "12.33";
		double b = Double.parseDouble(y);
		System.out.println(b + 10);

		// String to boolean:
		String k = "true";
		boolean d = Boolean.parseBoolean(k);
		System.out.println(d);

		// int to String conversion
		int j = 200;
		System.out.println(String.valueOf(j) + 20);

		// String to character conversion
		String c = "VIGNESH";
		System.out.println(c.length());
		for (int i = 0; i < c.length(); i++) {
			System.out.println(c.charAt(i));
		}

		String u = "100A";
		System.out.println(Integer.parseInt(u));

	}

}
