package com.OOP.DataAbstraction;

public class Axis implements RBI 
{

	public void custDetail()
	{
		System.out.println("Axies......customer data");
	}

	@Override
	public void deposite() {
		System.out.println("Axies......deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axies......Withdraw()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Axies.....rateOfInterest 7%()");
		
	}
}
