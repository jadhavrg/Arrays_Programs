package javatpoint.Number;

import java.util.Scanner;

public class ATMProgram 
{
	public static void main(String[] args) 
	{
		int balance = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		while(true) 
		{
			System.out.println("Automated Teller Machine");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposite Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Select the Option......");
			int option = scanner.nextInt() ;
			
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter the Amount: ");
				int amount = scanner.nextInt() ;
				if (balance >amount) 
				{
					balance -= amount ;
					System.out.println(amount+" Withdraw Successfully.");
				}
				else
				{
					System.out.println("Insufficient Balance.");
				}
				break ;
			}
			case 2:
			{
				System.out.println("Enter the amount: ");
				int amount = scanner.nextInt() ;
				balance += amount ;
				System.out.println(amount+" Deposited");
				break ;
			}
			case 3: 
			{
				System.out.println("Your balance is: "+balance);
				break ;
			}
			case 4:
			{
				System.out.println("Thank you..!");
				System.exit(0);
			}
			default:
			{
				System.out.println("Invalid Option...Please enter valid option..");
			}
			}
		}
	}
}
