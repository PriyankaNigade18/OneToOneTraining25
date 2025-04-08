package com.JavaBasics;

public class ThisKeywordDemo2 {

	//this can be used to invoke current class method (implicitly)
	public void m1()
	{
		System.out.println("M1 is calling....");
		this.m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling....");
		//this.m3();
		m3();
	}
	
	public static void m3()
	{
		System.out.println("M3 static  is calling....");
		
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();

	}

}
