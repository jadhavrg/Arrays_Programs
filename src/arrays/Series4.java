package arrays;

import java.util.Arrays;

// 4,13,-12,37,-84,?,...
public class Series4
{
//	public static void main(String[] args) 
	{
		int [] arr = new int [10] ;
		int num =4 ;
		arr[0] = num ;
		
		int primeNumer= 0 ;
		for(int k=1; k<arr.length;k++)
		{
			int cnt = 0 ;
			for(int i=3; ;i++)
			{
				int count =0; 
				for(int j=2;j<i;j++)
				{
					if (i%j==0)
					{
						count ++ ;
						break ;
					}
				}
				if (count == 0)
				{
					primeNumer = i * i ;
					cnt++ ;
					if (cnt==arr.length)
					{
						break ;
					}
				}
				
			}
			System.out.println(primeNumer);
			arr[k] = num + primeNumer;
			num = arr[k] ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
