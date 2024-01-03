package arrays;
// WAJP to clone a 1D array using clone() method.
import java.util.Arrays;

public class CloningArray1 
{
	public static void main(String[] args) 
	{
		int [] original = {10,20,30,40,50,60} ;
		
		int [] duplicate = original ;
		
		System.out.println("Original array: "+Arrays.toString(original));
		System.out.println("Duplicate Array: " + Arrays.toString(duplicate));
		original[3] = 100 ;
		System.out.println("Original array: "+Arrays.toString(original));
		System.out.println("Duplicate Array: " + Arrays.toString(duplicate));
	}
}
