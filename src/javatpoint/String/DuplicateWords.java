package javatpoint.String;
// Java program to find the duplicate words in a string
public class DuplicateWords 
{
	public static void main(String[] args) 
	{
		String str = "Big black bug bit a big black dog on his big black nose" ;
		
		String [] arr = str.split(" ") ;
		
		System.out.println("Duplicate words in a given string : ");   
		for(int i=0; i<arr.length; i++)
		{
			int count = 0 ;
			if (arr[i] != " ") 
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if (arr[i].equals(arr[j]))
					{
						count ++ ;
						arr[j] = " " ;
					}
				}
				
				if (count != 0) 
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
