package com.JavaBasics;



class A
{
	public A(ThisKeywordDemo5 t1)
	{
		System.out.println("This is A class Constructor...");
		System.out.println(t1.amount);
	}
}



public class ThisKeywordDemo5 {

	//A a1=new A();
	
	int amount=100;
	//this can be passed as argument in the constructor call.

	public ThisKeywordDemo5()
	{
		System.out.println("Current class constructor is calling...");
		A a1=new A(this);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo5 t5=new ThisKeywordDemo5();
		
		
				

	}

}
