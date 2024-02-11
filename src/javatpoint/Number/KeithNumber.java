package javatpoint.Number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeithNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int num = scanner.nextInt() ;
		
		if (isKeith(num)) 
		{
			System.out.println(num + " is a Keith number.");
		}
		else
		{
			System.out.println(num+ " is not a Keith number");
		}
	}
	
	public static boolean isKeith(int num) 
	{
		ArrayList<Integer> terms = new ArrayList<>() ;
		
		int temp = num ;
		int countDig = 0 ;
		
		while(temp!=0)
		{
			terms.add(temp%10) ;
			temp/=10 ;
			countDig++ ;
		}
		
		Collections.reverse(terms);
		
		int i = countDig ;
		int nextEle = 0 ;
		while(nextEle < num)
		{
			nextEle = 0 ;
			for(int j=1; j<=countDig; j++)
			{
				nextEle += terms.get(i-j) ;
			}
			terms.add(nextEle) ;
			i++ ;
		}
		return(nextEle == num) ;
	}
}
