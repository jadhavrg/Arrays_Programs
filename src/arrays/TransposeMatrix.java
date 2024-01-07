package arrays;
// WAJP to transpose a matrix.
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt() ;
		System.out.println("Enter the number of columns: ");
		int cols = scanner.nextInt() ;
		
		int [][] arr = new int [rows][cols] ;	
		int [][] transpose = new int [rows][cols] ;
		
		if (rows==cols) 
		{
			System.out.println("Enter " +(rows*cols)+ " elements: " );
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<arr[i].length;j++)
				{
					arr[i][j] =  scanner.nextInt() ;
				}
			}
			scanner.close();
			
			for(int [] a : arr)
			{
				System.out.println(Arrays.toString(a));
			}
		
		
			for(int i=0; i<arr.length; i++)
				for(int j=0; j<arr.length; j++)
				{
					transpose[j][i] = arr[i][j] ;
				}
			System.out.println("**************");
			for(int [] a : transpose)
			{
				System.out.println(Arrays.toString(a));
			}
		}
		else 
		{
			System.out.println("For transpose the matrix rows and Columns are must be same.");
		}


	}
}
