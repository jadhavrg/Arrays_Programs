package javatpoint.String;

import java.util.Arrays;

// Java Program to find maximum and minimum occurring character in a string.
public class MinMaxOccuranceCharacter 
{
	public static void main(String[] args)
	{
		String str = "javaprogrammingzaaaaaa" ;
		
		char [] ch = str.toCharArray() ;
		int [] arr = new int[ch.length] ;
		int ind = 0 ;
		
		for(int i=0; i<ch.length; i++)
		{
			 int freq = 1 ;
			 if (ch[i] != ' ')
			 {
				 for(int j=i+1; j<ch.length; j++)
				 {
					 if (ch[i] == ch[j]) 
					 {
						 freq ++ ;
						 ch[j] = ' ' ;
					 }
				 }
				 arr[ind++] = freq ;
			 }
		}
		
		int min , max ;
		min = max = arr[0] ;
		char minChar  ;
		char maxChar ;
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] != 0)
			{
				if (arr[i]>max) 
				{
					max = arr[i] ;
					maxChar = ch[i] ;
				}
				
				if (arr[i] < min) 
				{
					min = arr[i] ;
					minChar = ch[i] ;
				}
			}
		}
		
//		System.out.println("Minimum occurring character: " +min+ minChar);
		System.out.println();
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(arr));
	}
}
