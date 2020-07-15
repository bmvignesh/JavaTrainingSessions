package OopsConcept1;

public class Car {

	//Class vars:
	int mod;
	int wheel;
	
	public static void main(String[] args) {

	//new Car(); -- this is object of Car class
	// new keyword is used to create object
	//a,b,c are Object reference variables
		
	Car a = new Car();
	a.mod=2000;
	a.wheel=4;
	
	Car b = new Car();
	b.mod = 2005;
	b.wheel = 4;
	
	Car c = new Car();
	c.mod = 2020;
	c.wheel=4;
	
	System.out.println("before assigning the references");
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod);
	System.out.println(b.wheel);
	System.out.println(c.mod);
	System.out.println(c.wheel);
	System.out.println("after shifting the references");
	a=b;
	b=c;
	c=a;
	a.mod=10;
	System.out.println(a.mod); //10
	c.mod=20;
	System.out.println(a.mod); //20
	System.out.println(c.mod); //20
	
	}

}
