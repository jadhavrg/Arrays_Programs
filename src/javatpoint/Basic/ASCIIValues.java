package javatpoint.Basic;

public class ASCIIValues
{
	public static void main(String[] args)
	{
		System.out.print("The ASCII of the a to z: ");
		for(int i='a'; i<='z'; i++)
		{
			System.out.print(i+ ", ");
		}
		System.out.println();
		System.out.print("The ASCII of the A to Z: ");
		for(int i='A'; i<='Z'; i++)
		{
			System.out.print(i+ ", ");
		}
	}
}
