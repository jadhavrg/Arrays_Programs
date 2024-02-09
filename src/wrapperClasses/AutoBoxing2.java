package wrapperClasses;

public class AutoBoxing2 
{
	public static void main(String[] args) 
	{
		Integer integer = 127 ;
		Integer integer2 = 127 ;
		
		System.out.println(integer==integer2); //true
		
		Integer integer3 = 130 ;
		Integer integer4 = 130 ;
		
		System.out.println(integer3==integer4); //false
		
		Integer integer5 = 130 ;
		Integer integer6 = 130 ;
		
		System.out.println(integer5.equals(integer6)); //true
	}
}
