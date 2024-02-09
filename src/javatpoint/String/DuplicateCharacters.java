package javatpoint.String;
// Java program to find the duplicate characters in a string
public class DuplicateCharacters 
{
	public static void main(String[] args) 
	{
		String str = "Great responsibility" ;
		
		char [] ch = str.toCharArray() ;
		
		System.out.println("Duplicates Characters are: ");
		
		for(int i=0; i<ch.length; i++)
		{
			int count = 0 ;
			if (ch[i] != ' ') 
			{
				for(int j=i+1; j<ch.length; j++)
				{
					if (ch[i]==ch[j]) 
					{
						count ++ ;
						ch[j] = ' ' ;
					}
				}
				if (count != 0)
				{
					System.out.println(ch[i]);
				}
			}
		}
		
	}
}
