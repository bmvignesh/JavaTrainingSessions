package OopsConcept1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}

	public static void main(int d) {

	}

	public static void main(int e, int f) {

	}
	// we can overload main method

	// you cannot create a method inside a method
	// duplicate methods -- i.e same method name with same number of arguments are
	// not allowed

	// method overloading -- when method name is same with different arguments/input params within the same class
	//make sure they are having different data types
	public void sum() // 0 input param
	{
		System.out.println("sum method --zero param");
	}

	public void sum(int a) // 1 input param
	{
		System.out.println("sum method --1 param");
		System.out.println(a);
	}

	public void sum(int b, int c) // 2 input param
	{
		System.out.println("sum method --2 param");
		System.out.println(b + c);
	}
}
