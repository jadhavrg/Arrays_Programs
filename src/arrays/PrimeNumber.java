package arrays;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,5,4,10,11,13,15,19,21,23,29} ;
		
		for (int num : arr) 
		{
//			int primeNumber = isPrime(num) ;
			if (isPrime(num) != 0) 
			{
				System.out.println(num);
			}
		}
	}
	
	public static int isPrime(int num)
	{
		if (num <=1)
		{
			return 0 ;
		}
		
		int count = 0 ;
		
		for(int i=0; i<num; i++)
		{
			if (num%2==0)
			{
				count ++ ;
			}
		}
		
		if (count == 0)
		{
			return 1 ;
		}
		return  0 ;
	}
}
