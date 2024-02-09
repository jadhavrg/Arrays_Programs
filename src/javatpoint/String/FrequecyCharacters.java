package javatpoint.String;
// Java Program to find the frequency of characters
public class FrequecyCharacters 
{
	public static void main(String[] args) 
	{
		String str = "picture perfect" ;
		
		char [] ch = str.toCharArray() ;
		
		for(int i=0; i<ch.length; i++)
		{
			int freq = 1 ;
			if (ch[i] != ' ')
			{
				for(int j=i+1; j<ch.length;j++)
				{
					if (ch[i] == ch[j])
					{
						freq++ ;
						ch[j] = ' ' ;
					}
				}
				System.out.println(ch[i]+" --- " + freq);
			}
		}
	}
}
