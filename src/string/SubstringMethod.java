package string;
// IMPLEMENTION OF SUBSTRING() METHOD
import java.util.Scanner;

public class SubstringMethod 
{
	static String str ;
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the string value: ");
		str = scanner.next() ;
		scanner.close();
		SubstringMethod obj = new SubstringMethod() ;
		
		System.out.println(obj.subString(3));
		System.out.println(obj.subString(0,5));
		
		
	}
	
	public String subString(int ind) 
	{
		String a = "" ;
		for(int i=ind; i<str.length(); i++)
		{
			a += str.charAt(i) ;
		}
		return a ;
	}
	
	public String subString(int start, int end) 
	{
		String a = "" ;
		for(int i=start; i<end; i++)
		{
			a += str.charAt(i) ;
		}
		return a ;
	}
}
