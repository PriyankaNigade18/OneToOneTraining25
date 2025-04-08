package com.JavaBasics;

public class ThisKeywordDemo3 {

	//this() can be used to invoke current class constructor.

	ThisKeywordDemo3()
	{
		//this(101);
		System.out.println("Deafult constructor");
		//this(101);//Constructor call must be the first statement in a constructor
	}
	
	ThisKeywordDemo3(int num)
	{
		this();
		System.out.println("Parameterized constructor: "+num);
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo3 t1=new ThisKeywordDemo3(101);
		
				

	}

}
