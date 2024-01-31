package string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesWords 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the String value: ");
		String str = scanner.nextLine() ;
		scanner.close();
		
		System.out.println(removeDup(str));
	}
	
	public static String removeDup(String str) 
	{
		String [] arr = str.split(" ") ;
		List<String> list = Arrays.asList(arr) ;
		
		Set<String> set = new LinkedHashSet<>(list) ;
		
		String newStr = String.join(" ", set) ;
		return newStr ;
	}
}
