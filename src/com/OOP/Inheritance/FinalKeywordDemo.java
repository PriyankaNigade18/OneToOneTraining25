package com.OOP.Inheritance;


//final class Demo
class Demo
{
	final String loc="pune";
	final int pinCode=411047;
	
	public final void show()
	{
		System.out.println(loc);
		System.out.println(pinCode);
	}
	
}




//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
	//Cannot override the final method from Demo
//	@Override
//	public void show()
//	{
//		System.out.println(loc);
//		System.out.println(pinCode);
//		System.out.println("These data is called by show()");
//	}

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.show();
		
//		d1.loc="Satara";
//		d1.pinCode=8876554;
		
		d1.show();
		
		System.out.println("------------");
		Demo d2=new FinalKeywordDemo();
		d2.show();
		

	}

}
