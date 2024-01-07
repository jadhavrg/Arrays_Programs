package arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAJP for multiplication of an matrix.
public class MaltiplicationMatrix 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt() ;
		System.out.println("Enter the number of columns: ");
		int cols = scanner.nextInt() ;
		
		int [][] a = new int [rows][cols] ;
		int [][] b = new int [rows][cols] ;
		int [][] c = new int [rows][cols] ;
		
		if (rows == cols)
		{
			System.out.println("Enter the first array elements: ");
			for(int i=0;i<a.length; i++)
			{
				for(int j=0; j<a[i].length;j++)
				{
					a[i][j] = scanner.nextInt() ;
				}
			}
			
			for(int[] i: a)
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
			scanner.close();
			
			for(int [] i: b)
			{
				System.out.println(Arrays.toString(i));
			}
			
			// multiplication of an array
			
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length;j++)
				{
					c[i][j] = 0;
					for(int k=0 ; k<c.length; k++)
					{
						c[i][j] += a[i][k]*b[k][j] ;
					}
//					System.out.println(c[i][j]);
				}
			}
			
			System.out.println("******************");
			System.out.println("******************");
			for(int [] i: c)
			{
				System.out.println(Arrays.toString(i));
			}
		}
	}
}
