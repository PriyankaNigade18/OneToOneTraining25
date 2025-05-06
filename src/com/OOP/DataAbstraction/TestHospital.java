package com.OOP.DataAbstraction;

public class TestHospital {

	public static void main(String[] args)
	{
		// child class ref and child class object
		NobleHs n1= new NobleHs();
		n1.cardio();//inherited abstract
		n1.physio();//inherited abstract
		n1.medical();//individual
		n1.nero();//inherited abstract
		n1.dental();//inherited abstract
		n1.covid19Test();
		
		
		System.out.println("-------------------");
		//parent ref and child object
		IMA a1=new NobleHs();
		a1.cardio();
		a1.physio();
		a1.covid19Test();
		
		System.out.println("-------------------");

		USMA u1=new NobleHs();
		u1.nero();
		u1.dental();
		u1.covid19Test();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
