package com.OOP.Inheritance;

public class CarTest {

	public static void main(String[] args) 
	{
		System.out.println("Scenario1: child class ref and child class object");
		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.breakFeature();
		b1.price();

		System.out.println("Scenario2: Parent class ref and Parent class object");

		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.breakFeature();
		c1.price();
		
		
		System.out.println("Scenario2: Parent class ref and Child class object");

		Car c2=new BMW();
		c2.start();
		c2.refule();
		c2.stop();
		c2.breakFeature();
		c2.price();
		
		//Child class ref and child class object
		Audi a1=new Audi();
		a1.autoGear();
		a1.start();
		a1.refule();
		a1.stop();
		
		
		a1.breakFeature();
		//Parent ref and child object
		Car c3=new Audi();
		c3.start();
		c3.refule();
		c3.stop();
		
		c3.breakFeature();
		
		
		
		
		
		
		
		
	}

}
