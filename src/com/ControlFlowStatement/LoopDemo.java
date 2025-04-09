package com.ControlFlowStatement;

public class LoopDemo {

	public static void main(String[] args)
	{
		//print hello statement  5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("**************");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("**************");

		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************");
		
		
		int i=1;
		while(i<=10)
		{
			System.out.println("Welcome");
			i++;
		}
		
		System.out.println("*****************");
		//number of iteration are unknown then we use while loop
		//sum of digits
		//num=123 sum=6
		int num=123;
		int temp=num;
		int rem,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits for number "+temp+" is: ="+sum);
		
		
		System.out.println("*****************Reverse of number**************");
		
		int nu=123,rev=0,rm;
		int tm=nu;
		
		while(nu>0)
		{
			rm=nu%10;
			nu=nu/10;
			rev=rev*10+rm;
		}
		
		System.out.println("Reverse of number "+tm+" is:="+rev);
		
		System.out.println("******************************");
		int k=1;
		
		do {
			System.out.println("Bye");
			k++;
			
		}while(k<=3);
		
		
		
		
		//Nested loop
		
		
		
		
		
		
		
		
		
		
		

	}

}
