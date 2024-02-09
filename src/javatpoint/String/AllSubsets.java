package javatpoint.String;

import java.util.Scanner;
// Java Program to find all subsets of a string
public class AllSubsets 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close(); 
		
		int length = str.length() ;
		int temp = 0 ;	
 
		String [] arr = new String[(length*(length+1)/2)] ;
		
		for(int i=0; i<length; i++)
		{
			for(int j=i; j<length; j++)
			{
				arr[temp++] = str.substring(i, j+1) ;
			}
		}
		
		  System.out.println("All subsets for given string are: ");  
		  for(String s : arr)
		  {
			  System.out.println(s);
		  }
	}
}
