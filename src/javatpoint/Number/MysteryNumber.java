package javatpoint.Number;

import java.util.Scanner;

public class MysteryNumber
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		
		isMystery(num);
		
	}
	
	public static int reverse(int num) 
	{
		String str = Integer.toString(num);
		String newStr ="" ;
		
		for(int i=str.length()-1; i>=0;i--)
		{
			newStr+=str.charAt(i) ;
		}
		
		return Integer.parseInt(newStr) ;
	}
	
	public static void isMystery(int num)
	{
		int temp = num ;
		for(int i=1; i<=num/2; i++)
		{
			int j= reverse(i) ;
			System.out.println("reverse "+ j);
			
			if (i+j==temp) 
			{
				System.out.println(i+" "+j);
				System.out.println(num+" is a Mystery Number.");
			}
			else
			{
				System.out.println(num+" is not a Mystery Number.");
			}
		}
	}
}








//for (int i=1; i <= num/2; i++)  
//{  
//int j = reverse(i);    
//if (i + j == num)  
//{  
//      
//System.out.println( i + " " + j);  
//System.out.println(num+ " is a mystery number.");  
//return true;  
//}  
//}  
//System.out.println("The given number is not a mystery number.");  
