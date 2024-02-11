package javatpoint.Number;

import java.util.Scanner;

//  Peterson Number in Java
public class PetersonNumber 
{
	public static boolean isPeterson(int num) 
	{
		int temp = num ;
		int sum= 0 ;
		while(num !=0)
		{
			int fact =1 ;
			int rem = num%10 ;
			for(int i=1;i<=rem;i++)
			{
				fact*=i ;
			}
			sum+=fact ;
			num/=10;
		}
		
		if (temp==sum) 
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
		
		System.out.println(isPeterson(num)?num+" is Peterson number":num+" is not a Peterson number");
	}
}