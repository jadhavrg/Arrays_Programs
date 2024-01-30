package regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

// VALIDATION- rushi123@gmail.com
public class ValidateEmail 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the email: ");
		String email = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[a-z]{2,}[0-9]{1,}@[a-z]{2,9}.[a-z]{2,5}", email)) 
		{
			System.out.println(email + " is a valid email.");
		}
		else
		{
			System.out.println(email + " is not a valid email.");
		}
	}
}
