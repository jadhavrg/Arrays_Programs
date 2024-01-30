package regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

//Validation- It can contains alphanumerical characters and lengTH should be between 5 to 20

public class ValidateUsername 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter Your name: ");
		String name = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[a-zA-Z0-9]{5,20}", name)) 
		{
			System.out.println(name + " is a valid name");
		}
		else
		{
			System.out.println(name + " is not a valid name");
		}
	}
	
}
