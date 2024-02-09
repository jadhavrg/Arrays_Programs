package javatpoint.String;
// How to reserve a string in Java without using reverse function
import java.util.Scanner;

public class ReverseString2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.next() ;
		scanner.close();
		
		String newStr = "" ;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr += str.charAt(i) ;
		}
		
		System.out.println(newStr);
	}
}
