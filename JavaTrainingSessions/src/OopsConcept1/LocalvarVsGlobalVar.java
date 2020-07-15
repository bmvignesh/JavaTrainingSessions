package OopsConcept1;

public class LocalvarVsGlobalVar {

	//Global variables or class variables
	String name = "Tom";
	int age =25;
	public static void main(String[] args) {

		int i=10; //local variable for main method
		System.out.println(i);
		LocalvarVsGlobalVar obj = new LocalvarVsGlobalVar();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
		public void sum()
		{
			int i=15;  //local variable for sum method
			int j=20;
			int age =25;
		}
	

}
