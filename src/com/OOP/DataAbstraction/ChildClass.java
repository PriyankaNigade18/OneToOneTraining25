package com.OOP.DataAbstraction;

public class ChildClass extends AbstractClass
{
	@Override
	public void show() 
	{

		System.out.println("Child....show()");
		
	}
	
	public void test() 
	{
		System.out.println("Child.....test()");
	}
	public static void main(String[] args)
	{

		System.out.println("Scenario1: Child class ref and child class object:valid");
		ChildClass c1=new ChildClass();
		c1.accept();//inherited 
		c1.show();//inherited abstract
		c1.test();//individual
		
		System.out.println("Scenario2: Parent class ref and Parent class object:Invalid");
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
		
		System.out.println("Scenario3: Parent class ref and Child class object:valid");

		AbstractClass a1=new ChildClass();
		a1.accept();
		a1.show();
		
		System.out.println("Scenario4: Child class ref and Parent class object:Invalid");

		//ChildClass c2=new AbstractClass();
		
		
		
		
		
		
		
		


	}
	

}
