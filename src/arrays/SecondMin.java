package arrays;
// WAJP to find secong minimum element from an array.
public class SecondMin 
{
	public static void main(String[] args) 
	{
		int [] numbers = {10,20,30,45,75,12,451,542} ;
		
		int secondMin = getSecondMin(numbers, numbers.length) ;
		
		System.out.println("Second minimun element is: " + secondMin);
		
	}
	
	public static int getSecondMin(int [] num, int size)
	{
		int temp ;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if (num[i]<num[j])
				{
					temp = num[i] ;
					num[i] = num[j] ;
					num[j] = temp ;
				}
			}
		}
		return num[size-2] ;
	}
}
