package arrays;
//WAJP to fing armstrong elements from an anonymous array
public class ArmstrongNumber
{
	public static void isArmstrong(int [] numbers)
	{
		for (int number : numbers)
		{
			int sum  = 0;
			int count = 0 ;
			int temp1 = number;
			int  temp2 = number ;
			
			while(temp1 != 0)
			{
				count ++ ;
				temp1/=10 ;
			}
			
			while(temp2 != 0)
			{
				int power = 1 ;
				for(int i=0; i<count; i++)
				{
					int rem = temp2%10 ;
					power *= rem ;
				}
				
				sum += power ;
				temp2/=10 ;
			}
			
			if (sum == number)
			{
				System.out.println(" Armstrong numbers: " +number);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		isArmstrong(new int [] {101,153,371,500,451});
	}
}
