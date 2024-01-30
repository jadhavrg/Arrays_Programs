package regularExpression;
// validations - DD/MM/YYYY

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateDate 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the date: ");
		String date = scanner.next() ;
		scanner.close();
		
		if (Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", date)) 
		{
			String [] arr = date.split("/") ;
			int day = Integer.parseInt(arr[0]) ;
			int month = Integer.parseInt(arr[1]) ;
			int year = Integer.parseInt(arr[2]) ;
			
			if ((day<=31)&&(day>0)&&(month<13)&&(month>0)&&(year>=1947)) 
			{
				System.out.println(date + " is valid date.");
			}
			else
			{
				System.out.println(date + " is not a valid date.");
			}
		}
		else
		{
			System.out.println(date + " is not a valid date.");
		}
	}
}
