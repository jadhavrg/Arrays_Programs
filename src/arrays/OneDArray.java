package arrays;
//WAJP to print 1D array.
import java.util.Arrays;

public class OneDArray
{
	public static void main(String[] args)
	{
		int [] arr = {10,20,30,40,50,60} ;
		
//		1. for loop
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("****************");
		
//		2. while loop
		
		int j=0;
		while(j<arr.length)
		{
			System.out.print(arr[j] + " ");
			j++ ;
		}
		System.out.println();
		System.out.println("------------------");
		
//		3. do while loop
		
		int k=0;
		do
		{
			System.out.print(arr[k] + " ");
			k++;
		}while(k<arr.length) ;
		System.out.println();
		System.out.println("***********************");
		
//		4. for each loop
		
		for (int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------");
		
//		5. toString method
		
		System.out.println(Arrays.toString(arr));
	}
}
