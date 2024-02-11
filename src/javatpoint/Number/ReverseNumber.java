package javatpoint.Number;
// How to Reverse a Number in Java
import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		int reverse = 0;
		while(num!=0)
		{
			int rem = num%10;
			reverse = (reverse*10)+rem ;
			num /=10;
		}
		
		System.out.println("The reverse of the given number is: " + reverse);
	}
}
