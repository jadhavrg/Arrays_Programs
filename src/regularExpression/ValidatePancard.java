package regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

// VALIDATION - ABCDR1234Z
public class ValidatePancard 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the pancard number: ");
		String panNum = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNum)) 
		{
			System.out.println(panNum + " is valid number.");
		}
		else
		{
			System.out.println(panNum + " is not valid number.");
		}
	}
}
