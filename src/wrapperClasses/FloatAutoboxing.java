package wrapperClasses;

public class FloatAutoboxing 
{
	public static void main(String[] args) 
	{
		float a = 1.3f ;
		String b = "1.2" ;
		double c = 1.5 ;
		
		Float float1 = a ;
//		Float float2 = c ;
		Float float2 = (float) a ;
		System.out.println(float2); //1.3
		
		Float float3 = Float.valueOf(a) ;
		System.out.println(float3); //1.3
		Float float4 = new Float(a) ;
		System.out.println(float4); //1.3
		Float float5 = new Float(c) ;
		System.out.println(float5); //1.5
		
		Float float6 = new Float(b) ;
		System.out.println(float6); //1.2
		
		
	}
}
