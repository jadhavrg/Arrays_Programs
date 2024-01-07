package arrays;
// WAJP for addition of an matrix.
import java.util.Arrays;
import java.util.Scanner;

public class AdditionMatrix 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt() ;
		System.out.println("Enter the number of columns: ");
		int cols = scanner.nextInt() ;
		
		int [][] a = new int[rows][cols] ;
		
		int [][] b = new int [rows] [cols] ;
		int [][] c = new int[rows] [cols] ;
		
		if (rows==cols)
		{
			System.out.println("Enter the first array elements: ");
			for(int i=0; i<a.length;i++)
			{
				for(int j=0; j<a[i].length;j++)
				{
					a[i][j] = scanner.nextInt() ;
				}
			}
			
			for(int [] i: a)
			{
				System.out.println(Arrays.toString(i));
			}
			
			System.out.println("Enter the second array elements: ");
			for(int i=0; i<b.length;i++)
			{
				for(int j=0; j<b[i].length;j++)
				{
					b[i][j] = scanner.nextInt() ;
				}
			}
			
			System.out.println("************************");
			for(int [] i: b)
			{
				System.out.println(Arrays.toString(i));
			}
			
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length;j++)
				{
					c[i][j] = a[i][j]+b[i][j] ;
				}
			}
			System.out.println("************************");
			for(int [] i: c)
			{
				System.out.println(Arrays.toString(i));
			}
		}
		else
		{
			System.out.println("For addition the matrix rows and Columns are must be same. ");
		}
	}
}
