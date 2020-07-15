package OopsConcept2;

public class TestCar {

	public static void main(String[] args) {

		// static polymorphism -- compile time polymorphism
		// at time of compilation java will decide which method needs to be called
		// preference will be given to over-ridden methods
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();

		System.out.println("**************");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("**************");

		// Top casting
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable is
		c1.start(); // called dynamic polymorphism or run-time polymorphism
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println("**************");
		// Down casting -- trying to refer the parent class object by child class
		// reference variable is called down casting
		// it will result in ClassCastException
		BMW b1 = (BMW) new Car();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftsafety();
		b1.engine();

	}

}
