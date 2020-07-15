package ArrayPractice;

public class SingleDimSumOfArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of array using for loop is "+sum);
		
		int sum1=0,j=0;
		while(j<a.length)
		{
			sum1=sum1+a[j];
			j++;
		}
		System.out.println("Sum of array using while loop is "+sum1);
	}

}
