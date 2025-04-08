package com.JavaBasics;

import java.util.Scanner;

public class RuntimeParameterPassing 
{
	public void add(int a,int b)// 2 parameter
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		r1.add(num1,num2);
		
		int res=r1.sub(num1,num2);
		System.out.println("Subtarction is: "+res);

	}

}
