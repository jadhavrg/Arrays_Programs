package arrays;
// 18, 24, 84, 294, 798,?,?
import java.util.Arrays;

public class Series2
{
	public static void main(String[] args)
	{
		int [] arr = new int[10] ;
		int num = 18 ;
		arr[0] = num ;
		
		for(int i=1, even=2; i<arr.length; i++, even+=2)
		{
			int power = 1 ;
			for(int j=1; j<=3; j++)
			{
				power *= even ;
			}
			
			int nextNum = arr[i-1]+(power-even) ;
			arr[i] = nextNum ;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
