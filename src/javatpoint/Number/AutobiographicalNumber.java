package javatpoint.Number;

import java.util.Scanner;

// Autobiographical Number in Java
public class AutobiographicalNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = scanner.nextLong() ;
		long temp = num ;
		scanner.close(); 
		
		int count = 0, sum = 0;
		
		while(num != 0)
		{
			long rem = num%10 ;
			sum += rem ;
			count++ ;
			num/=10 ;
		}
		
		if (count==sum)
		{
			System.out.println(temp + " is Autobiographical Number");
		}
		else
		{
			System.out.println(temp+" is not a Autobiographical Number.");
		}
	}
}
