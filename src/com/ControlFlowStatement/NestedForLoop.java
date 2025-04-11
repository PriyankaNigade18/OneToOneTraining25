package com.ControlFlowStatement;

public class NestedForLoop {

	public static void main(String[] args)
	{

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("****************************");
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********************************");
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}


}
