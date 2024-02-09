package javatpoint.String;
// Java Program to find the largest and smallest word in a string
public class LargestSmallestWord 
{
	public static void main(String[] args) 
	{
		String str = "Java is not a fully object orinted language" ;
		
		String [] arr = str.split(" ") ;
		
		String small = "" ;
		String large = "" ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i].length() > small.length()) 
			{
				small = arr[i] ;
			}
		}
		
		System.out.println("Largest word: "+small);
		
		large = small ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i].length()<large.length()) 
			{
				large = arr[i] ;
			}
		}
		
		System.out.println("Smallest word: "+large);
		
	}
}
