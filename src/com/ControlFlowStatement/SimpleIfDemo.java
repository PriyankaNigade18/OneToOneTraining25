package com.ControlFlowStatement;

import java.util.Scanner;

public class SimpleIfDemo {

	//only for true codition
	public static void main(String[] args)
	{
		System.out.println("Program started!");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid user");
		}
		
		System.out.println("Program completed!");

	}

}
