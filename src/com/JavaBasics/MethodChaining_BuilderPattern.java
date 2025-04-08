package com.JavaBasics;

public class MethodChaining_BuilderPattern 
{//this can be used to return the current class instance from the method.

	
	public MethodChaining_BuilderPattern startBrowser()
	{
		System.out.println("Browser will start.....");
		return this;
	}
	
	public void stopBrowser()
	{
		System.out.println("Browser will stop.....");
	}

	public static void main(String[] args)
	{
		MethodChaining_BuilderPattern m1=new MethodChaining_BuilderPattern();
		m1.startBrowser().stopBrowser();
		


	}

}
