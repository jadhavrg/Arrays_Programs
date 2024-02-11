package javatpoint.Number;

import java.util.Scanner;

// Sunny Number in Java
public class SunnyNumber 
{
	public static boolean isSunny(double num) 
	{
		double sqrt = Math.sqrt(num) ;
		if (sqrt-Math.floor(sqrt)==0) 
		{
			return true ;
		}
		return false ;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		System.out.println(isSunny(num+1)?num+" is a Sunny number":num+" is not a Sunny number");
	}
}
