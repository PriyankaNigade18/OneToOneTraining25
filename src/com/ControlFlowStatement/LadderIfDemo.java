package com.ControlFlowStatement;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args)
	{
		/*
		 * Accept 3 numbers from the use and compare which one is greater
		 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+" & "+c);
		}else if(b>a && b>c)
		{
			System.out.println(b+" is greater than "+a+" & "+c);
		}
		else
		{
			System.out.println(c+" is greater than "+a+" & "+b);
		}
		
		*/
		
		//accept character and test it is Vowel
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().toLowerCase().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
			
		}else
		{
			System.out.println(ch+" is not vowel");
		}
		
		
		
//		String data=sc.nextLine();
//		char ch=data.charAt(0);
		
		/*
		if(ch=='a')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='i')
		{
			System.out.println(ch+" is vowel");

		}else if(ch=='o')
		{
			System.out.println(ch+" is vowel");

		}else if(ch=='u')
		{
			System.out.println(ch+" is vowel");

		}else
		{
			System.out.println(ch+" is not vowel");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
