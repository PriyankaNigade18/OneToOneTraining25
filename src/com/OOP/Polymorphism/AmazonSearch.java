package com.OOP.Polymorphism;

public class AmazonSearch 
{
	
	public void search(String pname)
	{
		System.out.println("Search Product by product Name: "+pname);
	}
	
	
	public void search(int price)
	{
		System.out.println("Search Product by product price: "+price);
	}
	
	
	public void search(String pname,int price)
	{
		System.out.println("Search Product by product Name: "+pname+" & Product price: "+price);
	}
	
	
	public void search(String pname,String bname)
	{
		System.out.println("Search Product by product Name: "+pname+" & product brand name: "+bname);
	}
	
	public void search(int price,String pname)
	{
		System.out.println("Search Product by product Name: "+pname+" & Product price: "+price);
	}

	public void search(String pname,String bname,int price)
	{
		System.out.println("Search Product by product Name: "+pname+" & Product price: "+price+" & product brand name: "+bname);
	}
}
