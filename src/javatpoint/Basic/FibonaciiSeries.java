package javatpoint.Basic;

import java.util.Scanner;

public class FibonaciiSeries 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number which we want till the fibonacii series: ");
		int n = scanner.nextInt() ;
		scanner.close();
		
		int a =0 ;
		int b =1 ;
		int c ;
		for(int i=0; i<n; i++)
		{
			c = a + b ;
			System.out.println(a);
			a=b ;
			b=c ;
		}
	}
}
