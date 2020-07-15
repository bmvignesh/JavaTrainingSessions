package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

	//1.while loop:
	//dis-advantage of while loop: it will generate infinite loop if you don't give incremental or decremental part
		int i=1; //initialization
		while(i<=10) //conditional
		{
			System.out.println(i);
			i++; //incremental/decremental
		}
		
	System.out.println("********************");
	//2.for loop:	
		
	//print 1 to 10	
	for (int j=0;j<=10;j++) //Initialization,conditional,incremental/decremental
	{
		System.out.println(j);
	}
	System.out.println("********************");
	//print 10 to 1
	for (int k=10;k>=1;k--)
	{
		System.out.println(k);
	}
	
	
	
	
	
	
	}

}
