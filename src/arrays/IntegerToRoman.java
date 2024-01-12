package arrays;
// WAJP to convert interger array into roman values.
import java.util.Scanner;

public class IntegerToRoman 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int [] arr = new int[sc.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the " + (i+1)+ " elements: ") ;
			arr[i] = sc.nextInt() ;
		}
		
		int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1} ;
		String [] romanValues = {"M", "DM","D","CD","C","LC","L","XL","X","IX","V","IV","I"} ;
		
		for(int num : arr)
		{
			System.out.print(num + ": ");
			for(int i=0; i<values.length; i++)
			{
				while(num >= values[i])
				{
					num = num -values[i] ;
					System.out.print(romanValues[i]);
				}
			}
			System.out.println();
		}
	
	}
}
