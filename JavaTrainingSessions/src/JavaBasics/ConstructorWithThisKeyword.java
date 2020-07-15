package JavaBasics;

public class ConstructorWithThisKeyword {

	//class vars
	String name ="Vignesh";
	int age =30;
	
	public ConstructorWithThisKeyword(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",25);

	}

}
