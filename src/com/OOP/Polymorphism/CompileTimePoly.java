package com.OOP.Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method Overloading
	 * ----------------------
	 * Method can be overloaded only when method has same name and different signature
	 * 1.Number of arguments
	 * 2.Type of Arguments
	 * 3.change Order of arguments
	 * 
	 * Constructor overloading possible but overriding is not possible
	 * Main() overloading possible but practically it is not required
	 * Operator overloading only for + operator possible
	 * 
	 * 
	 * Notes:
	 * =============
	 * Polymorphism : one thing many form
	 * REal time example: payment gateway,ola,uber
	 * Purpose: Method Reusability
	 * How to implement
	 * -------------------
	 * 1.Compile time/Early binding/Method overloading
	 * 2.Run time/late binding/Method Overriding 
	 * 
	 * 
	 */
	public void add()//0 parameter
	{
		int a=100,b=200;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	//Number of argument
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//Type of argument
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(double a,double  b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	//Change order of argument
	
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	CompileTimePoly()
	{
		System.out.println("Default construtor.....");
	}
	
	CompileTimePoly(int id)
	{
		System.out.println("Parameterized construtor.....id: "+id);
	}
	
	CompileTimePoly(String name)
	{
		System.out.println("Parameterized construtor.....name: "+name);
	}
	
	CompileTimePoly(int id,String name)
	{
		System.out.println("Parameterized construtor.....id: "+id+" : name: "+name);
	}
	
	
	
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(20,77);
		c1.add(56,890,990);
		c1.add(67.66,676.77);
		c1.add(556,99.70);
		
		CompileTimePoly c2=new CompileTimePoly("Sarang");
		
		
		
		
		
		

	}

}
