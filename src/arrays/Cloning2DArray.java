package arrays;import java.lang.reflect.Array;
import java.util.Arrays;

public class Cloning2DArray 
{
	public static void main(String[] args) 
	{
		int [][] original = {{10,20,30},{40,50,60,70,80}} ;
		int [] [] duplicate = new int [original.length][]  ;
		
		int index =  0 ;
		
		for(int [] dup : original)
		{
			duplicate[index++] = dup.clone() ;
		}
		
		System.out.println("Original Array: "+Arrays.deepToString(original));
		System.out.println("Duplicate Array: "+Arrays.deepToString(duplicate));
	}
}
