package com.ControlFlowStatement;

public class BranchingStatement {

	public static void main(String[] args)
	{

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//exit from switch and for body
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("************************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip certain part of execution and continue with next 
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
