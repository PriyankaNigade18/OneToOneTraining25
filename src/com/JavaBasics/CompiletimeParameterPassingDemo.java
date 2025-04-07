package com.JavaBasics;

public class CompiletimeParameterPassingDemo 
{
	
	public void add()//0 parameter
	{
		int a=10,b=10;//local
		System.out.println("Addition is: "+(a+b));
		
	}
	
	public void sub(int a,int b)//local 2 parameter  a=100 b=20
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void div(int a,int b)//2 parameter a=100 b=10
	{
		System.out.println("Division is: "+(a/b));
		
	}
	/*
	 * when you wanted to return any result/data from the method then we use return keyword
	 * 
	 * rule
	 * ========
	 * 1.declare return keyword inside method
	 * 2.change return type of method
	 * 3.return data get passed to the calling function
	 */
	
	public String info(String msg)//1 parameter
	{
		//System.out.println(msg);
		return msg;
	}

	public static void main(String[] args)
	{
		
		CompiletimeParameterPassingDemo c1=new CompiletimeParameterPassingDemo();
		
		c1.add();
		
		/*
		 * compile time Parameter passing
		 * When we pass a data at the time of compilation of the code
		 * is called compile time parameter passing
		 * 
		 * when you call that method and you are passing data then its compile time
		 * 
		 * parameter: values witch represented with variable
		 * 
		 * 
		 * Argument: original data
		 * 
		 * 
		 * 
		 */
		c1.sub(100,20);
		c1.div(100,10);
		
		String res=c1.info("Hello All!");
		System.out.println(res);
		
		

	}

}
