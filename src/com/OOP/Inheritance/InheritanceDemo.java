package com.OOP.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("m1 is calling......");
	}
}

class B extends A//A is parent and B is child :Single level Inheritance
{
	public void m2()
	{
		System.out.println("m2 is calling......");
	}
}

class C extends B//B is parent and C is child :Multi level Inheritance
{
	public void m3()
	{
		System.out.println("m3 is calling......");
	}
}


class D extends A//A is parent and D is child : Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("m4 is calling......");
	}
}

public class InheritanceDemo {

	public static void main(String[] args)
	{
	System.out.println("Scenario1: Parent class ref and Parent Class Object=Parent ");
//			A a1=new A();
//			a1.m1();
	
	//B is parent and C is child
//	B b1=new B();
//	b1.m1();//inherited 
//	b1.m2();//individual
	
	//A is parent and D is child
	
	A a1=new A();
	a1.m1();//individual
	
	
			
	System.out.println("Scenario2:Child class ref and Child Class Object= Parent + child ");
//	B b1=new B();
//	b1.m1();
//	b1.m2();
	
	//B is parent and C is child
//		C c1=new C();
//		c1.m1();//inherited 
//		c1.m2();//inherited 
//		c1.m3();//individual
	
	//A is parent and D is child
	
	D d1=new D();
	d1.m1();//inherited
	d1.m4();//individual
	
	
	System.out.println("Scenario3:Parent class ref and Child Class Object= Parent");
	//Data abstraction
//	A a2=new B();
//	a2.m1();
	
	//B is parent and C is child
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
	
	//A is parent and D is child
		
		A a2=new D();
		a2.m1();//individual
	System.out.println("Scenario4:Child class ref and Parent Class Object= Invalid ");

	//B b2=new A();
	
	
	
	
	
	
	
		

	}

}
