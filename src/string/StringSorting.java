package string;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to sort a String.
public class StringSorting 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter your name: ");
		String name = scanner.next() ;
		scanner.close();
		
		char [] names = new char[name.length()] ;
		for(int i=0; i<name.length(); i++)
		{
			names[i] = name.charAt(i) ;
		}
		System.out.println("Original Array: "+Arrays.toString(names));
		
		for(int i=0; i<names.length; i++)
		{
			char temp ;
			for(int j=i+1; j<names.length; j++)
			{
				if (names[i]>names[j])
				{
					temp = names[j] ;
					names[j] = names[i] ;
					names[i] = temp ;
				}
			}
		}
		
		System.out.println("After sorting Array: "+Arrays.toString(names));
	}
}
