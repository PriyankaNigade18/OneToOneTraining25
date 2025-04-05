package com.JavaBasics;

public class MethodDemo
{
	/*
	 * Methods
	 * ==========
	 * 1.Instance method
	 * ----------------------
	 * Method declared without static keyword that is instance
	 * Instance method need Object to call
	 * For every new object instance method /data will get the new memory
	 * 
	 * 2.static method
	 * ----------------
	 * Method declared with static keyword that is static 
	 * Static method we can call in same class directly
	 * Static method we can call in different class by its classname
	 * static variable /method creates only one time memory and share same 
	 * memory with all the object
	 * 
	 * 
	 */
	

	
	public void show()
	{
		System.out.println("This is instance method.....show()");
	}
	
	public static void test()
	{
		System.out.println("This is static method....test()");
	}
	
	
	
	public static void main(String args[])
	{
		//calling
		
		test();
		MethodDemo.test();
		
		
		//Object-instance
		
		MethodDemo m1=new MethodDemo();
		m1.show();
//The static method test() from the type MethodDemo should be accessed in a static way
		//m1.test();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
