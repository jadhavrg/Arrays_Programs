package javatpoint.Basic;
// How to Generate Random Number in Java
public class RandomNumber 
{
	public static void main(String[] args) 
	{
		int random = (int)(Math.random()*100) ;
		System.out.println("The Random number is: "+random); 
	}
}
