package regularExpression;
// VALIDATION - 1. FIRST TWO CHARACTERS MUST CONTAINS UPPERCASE CHARACTERS THEN -
//				2. NEXT TWO CHARACTERS CONTAINS DIGITS THEN -
//				3. NEXT TWO CHARACTERS CONTAISN UPPERCASE CHARACTERS THEN -
//				4. NEXT FOUR CHARACTERS CONTAINS DIGITS.

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationVehicleNum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the vehicle number: ");
		String vehNum = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[A-Z]{2}-[0-9]{2}-[A-Z]{2}-[0-9]{4}", vehNum)) 
		{
			System.out.println(vehNum + " is a valid vehicle number.");
		}
		else
		{
			System.out.println(vehNum + " is not a valid number.");
		}
	}
}
