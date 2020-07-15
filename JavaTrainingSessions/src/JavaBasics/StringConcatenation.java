	package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//+: is a concatenation operator
		//println - is used to print on the console with a new line
		//print - is just used to print on the console

	int a=100,b=200;
	String x="Hello";
	String y ="World";
	
	double c=12.33;
	double d=10.33;
	
	System.out.println(a+b); //300
	System.out.println(x+y);//HelloWorld
	System.out.println(a+b+x+y);//300HelloWorld
	System.out.println(x+y+a+b);//HelloWorld100200
	System.out.println(x+y+(a+b));//HelloWorld300
	System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
	System.out.println(a+b+x+y+a+b); //300HelloWorld100200
	System.out.println(c+d); //22.66
	System.out.println(x+y+c+d); //HelloWorld12.3310.33
	System.out.println("HelloWorld");
	System.out.println(a);
	System.out.println("the value of a is:"+a);
	System.out.println("the value of b is:"+b);
	System.out.println("the addition of a and b is" +(a+b));
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	
	}

}
