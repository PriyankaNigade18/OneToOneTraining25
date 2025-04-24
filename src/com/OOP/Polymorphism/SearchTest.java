package com.OOP.Polymorphism;

public class SearchTest {

	public static void main(String[] args)
	{
			AmazonSearch s=new AmazonSearch();
			s.search("Watch");
			s.search(30000);
			s.search(80000,"Laptop");
			s.search("Mobile",50000);
			s.search("Bag","Zara");
			s.search("Bottle","Milton",2000);

	}

}
