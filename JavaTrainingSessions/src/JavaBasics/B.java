package JavaBasics;

public class B extends A {
	public B() {
		super();
		//System.out.println("child class const with no param");

	}
	public B(int i) {
		super(i);
		//System.out.println("child class const with single param");

	}
	public B(int i,int j) {
		super(i,j);
		//System.out.println("child class const with 2 param");

	}

	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
		

	}
}
