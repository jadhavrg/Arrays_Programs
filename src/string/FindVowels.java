package string;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to find vowels from your name.
public class FindVowels 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter your name: ");
		String name = scanner.next() ;
		
		char [] ch = new char[name.length()] ;
		for(int i=0; i<name.length(); i++)
		{
			ch[i] = name.charAt(i) ;
		}
		System.out.println("The Array: " + Arrays.toString(ch));
		
		char [] vowelsArr = new char [4] ;
		int index = 0 ;
		for(char i=0; i<ch.length; i++)
		{
			if ((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U')) 
			{
				vowelsArr[index++] = ch[i] ;
			}
		}
		
		System.out.println("Vowels Array: " + Arrays.toString(vowelsArr));
	}
}
