package com.JavaBasics;

public class ConstructorDemo 
{
	
	int id;
	String name;
	
	public ConstructorDemo()
	{
		System.out.println("This is default constructor.....");
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
	}
	
	/*
	 * Constructor used to initialize Object
	 */
	public ConstructorDemo(int i,String n)//i=101 n=sarang
	{
		System.out.println("Constructor calling for initialize Object");
		System.out.println("This is Parameterized constructor....:");
		//instance=local
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.println("Display() is calling.....");
		System.out.println("After initialize data is: ");
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
	}

	public static void main(String[] args) 
	{
		
		//Constructor get called at the time object creation
		//ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo c2=new ConstructorDemo(101,"Sarang");
		c2.display();
		
		
		
		

	}

}
