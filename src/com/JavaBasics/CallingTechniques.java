package com.JavaBasics;

public class CallingTechniques 
{
	public void m1()
	{
		System.out.println("M1 is calling....");
		//m2();
		this.m2();
	}
	public void m2()
	{
		System.out.println("M2 is calling....");
		//m3();
		this.m3();
	}
	
	public void m3()
	{
		System.out.println("M3 is calling....");
		//m1();//StackOverflowError
	}

	public static void main(String[] args)
	{
		CallingTechniques c1=new CallingTechniques();
		c1.m1();

		
	}

}
