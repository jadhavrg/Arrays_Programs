package arrays;
// WAJP to print 2D array in all possible ways.
import java.util.Arrays;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		int [][] arr = {{10,20},{30},{40,50,60}} ;
		
//		1.for loop
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("**************");
		
//		2. while loop
		
		int a=0;
		while(a<arr.length)
		{
			int b= 0;
			while(b<arr[a].length)
			{
				System.out.print(arr[a][b] + " ");
				b++ ;
			}
			a++ ;
			System.out.println();
		}
		System.out.println("*****************");
		
//		3. do while loop
		
		int c= 0;
		do
		{
			int d = 0 ;
			do
			{
				System.out.print(arr[c][d] + " ");
				d++ ;
			}while(d<arr[c].length) ;
			c++ ;
			System.out.println();
		}while(c<arr.length) ;
		
		System.out.println("*****************");
		
//		4. for each loop
		
		for(int[] e : arr)
		{
			for(int f : e)
			{
				System.out.print(f + " ");
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		
//		5.toString method
		
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println("*****************");
		
//		6. deepToString method
		
		System.out.println(Arrays.deepToString(arr));
	}
}
