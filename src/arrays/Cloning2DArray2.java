package arrays;

import java.util.Arrays;

public class Cloning2DArray2 
{
	public static void main(String[] args) 
	{
		String [][] names = {{"Vishal", "Nikam"}, {"Rushi", "Jadhav"}, {"Pravin", "Jadhav"}} ;
		String [][] duplicate = new String [names.length][] ;
		
		for(int j=0; j<names.length; j++)
		{
			duplicate[j] = new String[names[j].length] ;
		}
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=0; j<names[i].length; j++)
			{
				duplicate[i][j] = names[i][j] ;
			}
		}
		
		System.out.println(Arrays.deepToString(names));
		System.out.println(Arrays.deepToString(duplicate));
	}
}
