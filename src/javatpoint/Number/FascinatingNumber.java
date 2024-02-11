package javatpoint.Number;

import java.util.Scanner;

// Fascinating Number in Java
public class FascinatingNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		scanner.close();
		
		int n1 = num*2 ;
		int n2 = num*3 ;
		
		String str = num+""+n1+n2 ;
		System.out.println(str);
		boolean flag = true ;
		
		for(char i='1'; i<='9'; i++)
		{
			int count = 0 ;
			for(int j=0; j<str.length(); j++)
			{
//				System.out.println(i+"dfghj");
				char ch = str.charAt(j) ;
				if (i==ch) 
				{
					count ++ ;
				}
			}

			if (count > 1 || count==0)
			{
				flag = false ;
				break ;
			}
		}
		
		if (flag) 
		{
			System.out.println(num+" is a Fascinating Number");
		}
		else
		{
			System.out.println(num+ " is not a Fascinating Number");
		}
	}
}
