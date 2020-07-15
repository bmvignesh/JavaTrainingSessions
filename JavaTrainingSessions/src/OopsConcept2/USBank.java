package OopsConcept2;

public interface USBank {

	int min_bal = 100;

	public void credit();

	public void debit();

	public void transfermoney();

	// only method declaration
	// no method body - only method prototype
	// in interface, we can declare the variables, vars are by default static in
	// nature
	// vars value will not be changed, its final/constant in nature
	// no static method in interface
	// no main method
	// we cannot create object of interface
	// Interface is abstract in nature
}
