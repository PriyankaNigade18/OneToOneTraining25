package com.OOP.DataAbstraction;

public class HDFC implements RBI
{
	public void custData()
	{
		System.out.println("HDFC.....Suctomer details");
	}

	@Override
	public void deposite() {
		System.out.println("HDFC.......deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....Withdraw()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.......rateOfInterest 8%()");
		
	}

}
