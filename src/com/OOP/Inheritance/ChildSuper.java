package com.OOP.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id: "+cid);
		System.out.println("Child income is: $15000");
	}
	
	public ChildSuper()
	{
		super();
		System.out.println("Child constructor is calling....");
	}

	public static void main(String[] args) 
	{

		ChildSuper c1=new ChildSuper();

		c1.childIncome();

	}

}
