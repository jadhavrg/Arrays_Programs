package wrapperClasses;

public class BooleanAutoboxing 
{
	public static void main(String[] args) 
	{
		boolean b = false ;
		System.out.println(b); //false
		
		Boolean boolean1 = Boolean.valueOf(b) ;
		System.out.println(boolean1); //false
		Boolean boolean2 = new Boolean(b) ;
		System.out.println(boolean2); //false
		Boolean boolean3 = new Boolean("GALAT") ;
		System.out.println(boolean3); //false
		Boolean boolean4 = new Boolean("0") ;
		System.out.println(boolean4); //false
		Boolean boolean5 = new Boolean("1") ;
		System.out.println(boolean5); //false
		Boolean boolean6 = new Boolean("true") ; 
		System.out.println(boolean6); // true
		Boolean boolean7 = new Boolean("TrUe") ; 
		System.out.println(boolean7); // true
		Boolean boolean8 = new Boolean("TRUE") ;
		System.out.println(boolean8); // true
		
	}
}
