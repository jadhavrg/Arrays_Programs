package arrays;
// WAJP to find frequency of elements from an array.
import java.util.Scanner;

public class FrequencyElement
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the size of an array: ");
		int arr [] = new int [scanner.nextInt()] ;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the " + (i+1)+ " elements: ");
			arr[i] = scanner.nextInt() ;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 1 ;
			if (arr[i] != 0)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count ++ ;
						arr[j] = 0 ;
					}
					
				}
				if (arr[i]!=0)
				{
					System.out.println(arr[i] + " is repeated " + count + " timees ");
				}
			}
			
			
		}
	}
}
