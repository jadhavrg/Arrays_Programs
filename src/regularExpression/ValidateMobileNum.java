package regularExpression;
// validation - FIRST DIGIT MUST BE BETWEEN 6 TO 9 AND LENGTH MUST BE 10 .
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateMobileNum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter your mobile number: ");
		String phone = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[6-9]{1}[0-9]{9}", phone)) 
		{
			System.out.println(phone + " is a valid number.");
		}
		else
		{
			System.out.println(phone + " is not a valid number.");
		}
	}
}
