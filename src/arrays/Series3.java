package arrays;
//11, 13, 19, 49,?,?..
import java.util.Arrays;

public class Series3 
{
	public static void main(String[] args) 
	{
		int [] arr = new int[10] ;
		int num = 11 ;
		arr[0] = num ;
		
		int k=1;
		for(int i=1; i<arr.length; i++)
		{
			int power = 1 ;
			for(int j=i; j>0; j--)
			{
				power = power * k ;
			}
			
			int nextNum = arr[i-1] + (power+i) ;
			arr[i] = nextNum ;
			k++ ;
		}
		
		System.out.println(Arrays.toString(arr));
			
	}
}
