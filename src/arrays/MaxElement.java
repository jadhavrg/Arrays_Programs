package arrays;
// WAJP to find maximam number in an array.
public class MaxElement 
{
	public static void main(String[] args) 
	{
		int [] arr = {62,21,54,22,56,45,23,45,220} ;
		
		int max = arr[0] ;
		for(int i=0; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max = arr[i] ;
			}
		}
		System.out.println("The maximam number is: " + max);
	}
}
