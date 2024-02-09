package javatpoint.String;

import java.util.Scanner;

// Java Program to count the total number of characters in a string
public class CountChar 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.nextLine() ;
		scanner.close(); 
		
//		System.out.println("Length of characters is: " + str.length());
		int count  = 0 ;
		for(int i=0; i<str.length(); i++)
		{
			if (str.charAt(i) != ' ') 
			{
				count ++ ;
			}
		}
		
		System.out.println("Length of characters is: " + count);
	}
}
