package com.OOP.DataAbstraction;

//protected  modifier

public class TestBank {

	public static void main(String[] args) 
	{
		// Child class ref and child class object
		HDFC h1=new HDFC();
		h1.custData();//individual
		h1.deposite();//inherited abstract
		h1.withdraw();////inherited abstract
		h1.rateOfInterest();//inherited abstract
		
		System.out.println("---------------------------");
		
		Axis a1=new Axis();
		a1.custDetail();//individual
		a1.deposite();//inherited abstract
		a1.withdraw();//inherited abstract
		a1.rateOfInterest();//inherited abstract
		
		
		//parent ref and parent object -Invalid
		//RBI r1=new RBI();
		
		//parent class ref and child class object:valid
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
		
	}

}
