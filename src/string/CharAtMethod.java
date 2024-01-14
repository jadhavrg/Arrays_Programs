package string;

import java.util.Scanner;

public class CharAtMethod 
{
	String name ;
	public static void main(String[] args) 
	{
		CharAtMethod ca = new CharAtMethod() ;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter your name: ");
		ca.name = scanner.next() ;
		System.out.println("Enter the index value: ");
		int c = scanner.nextInt() ;
		scanner.close();
		
		System.out.println(ca.findChatAt(c));
	}
	
	public char findChatAt(int index) 
	{
		char [] arr = name.toCharArray() ;
		
		try {
			return arr[index] ;
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("U HAVE ENTERED WRONG INDEX VALUE.");
		}
		
		return ' ' ;
	}
}
