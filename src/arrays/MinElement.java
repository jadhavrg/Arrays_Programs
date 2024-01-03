package arrays;
//WAJP to find minimum number in an array.
public class MinElement
{
	public static void main(String[] args) 
	{
		int [] arr = {55,12,48,56,21,54,2,515,235} ;
		
		int min = arr[0] ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (min>arr[i])
			{
				min = arr[i] ;
			}
		}
		System.out.println("The Minimim element is: " + min);
	}
}
