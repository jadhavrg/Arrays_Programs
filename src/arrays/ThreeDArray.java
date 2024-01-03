package arrays;

import java.util.Arrays;

//WAJP to print 3D array in all possible ways.
public class ThreeDArray 
{
	public static void main(String[] args) 
	{
		int [][][] arr = {{{10,20,30,40}, {50,60,70}}, {{80,90}, {100,110,120}}, {{130,140,150,160}} } ;
		
//		1.for loop
		
		System.out.println("Using for loop:");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("**********************");
		
//		2. while loop
		
		System.out.println("Using while loop:");
		
		int i = 0 ;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				int k=0 ;
				while(k<arr[i][j].length)
				{
					System.out.print(arr[i][j][k] + " ");
					k++;
				}
				j++ ;
				System.out.println();
			}
			i++ ;
			System.out.println();
		}
		System.out.println();
		System.out.println("**********************");
		
//		3. do-while loop
		
		System.out.println("Using do-while loop:");
		
		int a = 0;
		do {
			int b = 0;
			do {
				int c = 0 ;
				do {
					System.out.print(arr[a][b][c] + " ");
					c++ ;
				}while(c<arr[a][b].length) ;
				b++ ;
				System.out.println();
			}while(b<arr[a].length) ;
			a++ ;
			System.out.println();
		}while(a<arr.length);
		
		System.out.println();
		System.out.println("**********************");
		
//		4. for-each loop
		System.out.println("Using for-each loop:");
		for(int[][] d: arr)
		{
			for(int[] e: d)
			{
				for(int f: e)
				{
					System.out.print(f + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("**********************");
	
//		5. toString() method
		System.out.println("Using toString() method");
		
		for(int[][] x: arr)
		{
			for(int [] y: x)
			{
				System.out.println(Arrays.toString(y));
			}
		}
		System.out.println();
		System.out.println("**********************");
		
//		6. deepToString() method
		
		System.out.println("Using deepToString() method");
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println();
		System.out.println("**********************");
	}
}
