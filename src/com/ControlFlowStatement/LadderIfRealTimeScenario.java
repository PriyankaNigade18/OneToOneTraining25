package com.ControlFlowStatement;

import java.util.Scanner;

public class LadderIfRealTimeScenario {

	public static void main(String[] args)
	{

		/*
		 * String Equality
		 * -------------------
		 * 1.equals()
		 * -------------------
		 * it will test exact match 
		 * this method is case sensitive
		 * 
		 * 2.equalsIgnoreCase()
		 * ----------------------
		 * this is not case sensitive
		 
		
		String act="Hello All";
		String exp="Hello all";
		
		System.out.println(act.equals(exp));//false
		
		System.out.println(act.equalsIgnoreCase(exp));//true
		
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on "+bname);
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on "+bname);

		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on "+bname);

		}else
		{
			System.out.println("Please Enter correct browser name");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
