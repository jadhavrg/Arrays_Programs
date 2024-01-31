package string;

import java.util.Arrays;
import java.util.Scanner;

public class SortString
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close();
		
		System.out.println("Sorted String is : "+getSortedString(str));
		
	
	}
	
	public static String getSortedString(String s) 
	{
		char [] ch = s.toCharArray() ;
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=0; j<ch.length; j++)
			{
				if (ch[i]<ch[j]) 
				{
					char temp = ch[i] ;
					ch[i] = ch[j] ;
					ch[j] = temp ;
				}
			}
		}
		
		return new String(ch) ;
	}
}
