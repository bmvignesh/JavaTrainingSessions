package OopsConcept2;

public class HSBCBank implements USBank, BrazilBank { // we are achieving multiple inheritance
	// Is-a relationship

	// If a class is implementing any interface then it is mandatory to define/over
	// ride all methods of interface

	// over riding from USBank
	public void credit() {
		System.out.println("hsbc credit");
	}

	public void debit() {
		System.out.println("hsbc debit");
	}

	public void transfermoney() {
		System.out.println("hsbc money transfer");
	}

	// seperate method of hsbc bank
	public void educationloan() {
		System.out.println("hsbc education loan");
	}

	public void carloan() {
		System.out.println("hsbc car loan");
	}

	// overriding from brazilbank
	public void mutualfund() {
		System.out.println("brazil bank mutual fund");
	}

}