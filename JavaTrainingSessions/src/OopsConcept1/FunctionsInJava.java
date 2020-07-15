package OopsConcept1;

public class FunctionsInJava {

	// main method -- starting point of execution
	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created , obj is the object reference variable, referring
		// to this object
		// after creating the object, the copy of all non static methods will be given
		// to this object
		obj.test();
		int d = obj.pqr();
		System.out.println(d);
		String a = obj.qa();
		System.out.println(a);
		int e = obj.division(20, 10);
		System.out.println(e);

	}
	// non static methods

	// void -- does not return any value
	// return type= void

	public void test() // no input,no output
	{
		System.out.println("test method");
	}

	// return type = int
	public int pqr() // no input,some output
	{
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// return type = String
	public String qa() // no input,some output
	{
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	// return type =int
	// x,y => input parameters/arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;
		return d;
	}
}
