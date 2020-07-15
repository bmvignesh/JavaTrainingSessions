package OopsConcept1;

public class StaticAndNonStaticConcept {

	// global variables -- scope of global variables will be available across all
	// the functions with some conditions
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {

		// how to call static methods and vars
		// 1. Direct calling
		// 2. Call by classname

		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// how to call non static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);

		obj.sendmail();

		// can i access static method by using object reference? yes
		obj.sum(); // warning will be given

	}

	public void sendmail() // non static method
	{
		System.out.println("send mail");
	}

	public static void sum() // static method
	{
		System.out.println("sum method");
	}
}
