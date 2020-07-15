package OopsConcept2;

public class BMW extends Car { // has-a relationship

	// when same method is present in parent class as well as child class with same
	// name and same number of arguments,it is called method overriding
	// preference is given to over-ridden method
	public void start() { // over-ridden method
		System.out.println("bmw start");
	}

	public void theftsafety() {
		System.out.println("bmw theftsafety");
	}
}
