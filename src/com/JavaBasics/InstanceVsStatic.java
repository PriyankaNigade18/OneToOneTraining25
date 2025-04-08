package com.JavaBasics;

public class InstanceVsStatic 
{
	static int count=1;
	
	public InstanceVsStatic()
	{
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args)
	{
		InstanceVsStatic i1=new InstanceVsStatic();
		InstanceVsStatic i2=new InstanceVsStatic();
		InstanceVsStatic i3=new InstanceVsStatic();
		InstanceVsStatic i4=new InstanceVsStatic();
		InstanceVsStatic i5=new InstanceVsStatic();
		

	}

}
