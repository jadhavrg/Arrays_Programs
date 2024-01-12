package arrays;

import java.util.Arrays;

// 4,13,-12,37,-84,?,...
public class Series4
{
	public static void main(String[] args) 
	{
		int [] arr = new int [10] ;
		int num =4 ;
		arr[0] = num ;
		int index = 1 ;
		int flag = 1 ;
		
		for(int i=3; ; i++)
		{
			int count =0  ;
			for(int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					count ++ ;
				}
			}
			
			if (count == 0 )
			{
				if (flag%2!=0)
				{
					num = arr[index-1]+(i*i) ;
					arr[index++] = num;
				}
				else
				{
					num = arr[index-1]-(i*i) ;
					arr[index++] = num;
					
				}
				
				flag ++ ;
			}
			
			
			if (index > arr.length-1)
			{
				break ;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
