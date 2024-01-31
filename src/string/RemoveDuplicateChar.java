package string;

import java.util.Scanner;

// WAJP TO REMOVE DUPLICATE CHARACTERS FROM A STRING.
public class RemoveDuplicateChar 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close();	
		System.out.println("After removing the duplicates are: "+removeDup(str));

	}
	
	public static String removeDup(String s) 
	{
		String newStr = "" ;
		for(int i=0; i<s.length(); i++)
		{
			int j=0;
			for(;j<i; j++)
			{
				if (s.charAt(i) == s.charAt(j)) 
				{
					break ;
				}
			}
			if (i==j) 
			{
				newStr+= s.charAt(i) ;
			}
		}
		
		return newStr ;
	}
}
