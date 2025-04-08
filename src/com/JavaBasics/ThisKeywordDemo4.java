package com.JavaBasics;

public class ThisKeywordDemo4 {

	//this can be passed as an argument in the method call.

	int amount=100;
	
	public void accept()
	{System.out.println("Accept is calling.....");
		show(this);
	}
	
	
	public void show(ThisKeywordDemo4 t1)
	{
		System.out.println("Show is calling....");
		System.out.println(t1.amount);
		
	}
	
	public void showStudentData(StudentData s1)
	{
		s1.id=101;
		s1.name="Priya";
		System.out.println("student class is calling");
		s1.show();
	}
	
	public static void main(String[] args) 
	{
		
		ThisKeywordDemo4 t4=new ThisKeywordDemo4();
		//same class object
		t4.accept();
		
		
		StudentData student=new StudentData();
		//differnt class object
		t4.showStudentData(student);
		
				

	}

}
