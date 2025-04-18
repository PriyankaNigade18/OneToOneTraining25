package com.OOP.Encapsulation;

public class BankAccount 
{
	
	private int acno=565444;
	private int amount;
	public int getAcno() {
		return acno;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount)
	{	
		if(amount>=1000)
		{
		this.amount = amount;
		System.out.println("Your account is created!");
		System.out.println("Your balance: "+getAmount());
		System.out.println("Your account number is: "+getAcno());
		}
		else
		{
			System.out.println("Amount is not matching criteria...Account not created!");
		}
	}
	
	

}
