package arrays;
// WAJP to find the palindrome numbers in an array
public class PalindromeNumber
{
	public static boolean isPalindrome(int num) 
	{
		int rev = 0 ;
		int temp = num ;
		while(num != 0)
		{
			int rem = num % 10 ;
			rev = rev*10+ rem ;
			num/=10 ;
		}
		if (temp == rev)
		{
			return true ;
		}
		return false ;
	}
	
	public static void main(String[] args) 
	{
		int [] numbers = {10,20,121,251,252,151,555} ;
		for (int number : numbers)
		{
			if (isPalindrome(number))
			{
				System.out.print(number + " ");
			}
		}
	}
}
