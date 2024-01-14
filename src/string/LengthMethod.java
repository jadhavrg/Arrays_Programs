package string;

import java.util.Scanner;

// New 
public class LengthMethod 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String: ");
		String str = scanner.next() ;
		scanner.close();
		
		System.out.println("Length of "+str+" is: "+ findLength(str));
	}
	
	static int findLength(String s)
	{
		int length = 0 ;
		
		for(int i=0; ; i++)
		{
			try {
				s.charAt(i) ;
				length++ ;
				
			} catch (StringIndexOutOfBoundsException e) {
				break ;
			}
		}
		return length ;
	}
}
