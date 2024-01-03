package arrays;
// WAJP to add the all elements and print the sum.

public class SumOfArrays 
{
	public static void main(String[] args) 
	{
		long [] arr = {100,200,300,400,500,600} ;
		long sum = 0 ;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i] ;
		}
		
		System.out.println("Sum of arrays is : " + sum);
	}
}
